fun main() {
    var i = 0
    for(index in 1..100) {
        i += 1
        println(i)
    }

    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for((index, letter) in alphabet.withIndex()){
        println("$index : $letter")
    }

    val exercises = listOf("Приседания", "Бег", "Поднятие тяжостей", "Квадробика", "Выпады")
    for (exercise in exercises) {
        println("Упражнение: $exercise")
    }

    val heartRates = mapOf(
        "Приседания" to 125,
        "Бег" to 140,
        "Поднятие тяжостей" to 130,
        "Квадробика" to 180,
        "Выпады" to 110
    )

    for (exercise in exercises) {
        val heartRate = heartRates[exercise]
        println("Пульс во время $exercise: $heartRate ударов в минуту")
    }

    val text = "Столица Казахстана - Астана"
    val char = 'а'
    println(text.lowercase().count() {it == char})

    val numbersArray = arrayOf(0, 1, 2, 3, 4, 1, 5, 6, 2, 1)
    println(numbersArray.count() {it == 1})

    var number = 0
    for(index in 1..10) {
        number += 2
        println(number)
    }

    for (number in 2..20 step 2) {
        println(number)
    }
}