fun main() {
    val transfer = 85_000
    val typeOfCard = "Mastercard"
    val vkPay = false

    val commission = calculateCommission(transfer, typeOfCard, vkPay)

    println("Коммиссия составляет $commission рублей ")

}

fun calculateCommission (transfer: Int, typeOfCard: String, vkPay: Boolean ): Any {
    val commissionDependingOfTypeCard = when (typeOfCard) {
        "Mastercard", "Maestro" -> if (transfer in 300 .. 75_000) 0 else transfer * 0.006 +20
        "Visa", "Мир" -> if (transfer*0.0075>= 35) transfer*0.0075 else 35
        else -> throw IllegalArgumentException ("Неизвестный тип карты $typeOfCard")
    }

    if(!vkPay) {
        return commissionDependingOfTypeCard
    }
        return 0
}





