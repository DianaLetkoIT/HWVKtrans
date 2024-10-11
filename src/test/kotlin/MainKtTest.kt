import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommission() {
        val transfer = 85_000
        val typeOfCard = "Mastercard"
        val vkPay = false
        val result = calculateCommission(transfer, typeOfCard, vkPay )

        assertEquals (530, result)
    }
}