import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionMastercardIn() {
        val transfer = 65_000
        val typeOfCard = "Mastercard"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (0 , result)
    }

    @Test
    fun calculateCommissionMastercardOutMax() {
        val transfer = 85_000
        val typeOfCard = "Mastercard"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (535.0 , result)
    }

    @Test
    fun calculateCommissionMastercardOutMin() {
        val transfer = 250
        val typeOfCard = "Mastercard"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (21.5 , result)
    }

    @Test
    fun calculateCommissionVisaOut() {
        val transfer = 1000
        val typeOfCard = "Visa"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (35 , result)
    }

    @Test
    fun calculateCommissionVisaIn() {
        val transfer = 85_000
        val typeOfCard = "Visa"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (637.5 , result)
    }

    @Test
    fun calculateCommissionVKPay() {
        val transfer = 85_000
        val typeOfCard = "Mastercard"
        val vkPay = true
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (0 , result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculateCommissionOut() {
        val transfer = 85_000
        val typeOfCard = "Master"
        val vkPay = false
        calculateCommission(transfer, typeOfCard, vkPay )
    }

}









































