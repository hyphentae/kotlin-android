fun main(){
    println("0. ${43 == 53}")
    println("1. ${9 == 9}")
    println("2. ${9 != 9}")
    println("3. ${47 > 90}")
    println("4. ${47 < 90}")
    println("5. ${4 <= 4}")
    println("6. ${4 >= 5}")
    println("7. ${(47 > 90) && (47 < 90)}")
    println("8. ${(47 > 90) || (47 < 90)}")
    println("9. ${!true}")

    var tenge = 0
    if (tenge == 0) {
        println("Извини, но ты на мели!")
    }

    tenge = 300

    if (tenge == 0) {
        println("Извини, но ты на мели!")
    }
    else{
        println("Вау, у тебя есть деьнги на пирожки!")
    }

    tenge = 2000
    if (tenge == 0) {
        println("Извини, но ты на мели!")
    }
    else if (tenge < 400) {
        println("Вау, у тебя есть деньги на пирожки!")
    }
    else{
        println("Едем на Такси! Ножки отдыхают")
    }

    val hasFish = true
    val hasPizza = true
    val hasVegan = false

    if ((hasFish || hasPizza) && hasVegan) {
        println("Поехали!")
    } else {
        println("Извините, нам нужно выбрать другое место")
    }

    print("Введите число: ")
    val num: Int = readLine()!!.toInt()
    if (num > 0){
        println("Число положительное")
    }
    else if (num == 0){
        println("Не является ни положительным, ни отрицательным числом")
    }
    else {
        println("Число отрицательное")
    }

    print("Введите число от 1 до 4: ")
    val season: Int = readLine()!!.toInt()
    when(season) {
        1 -> println("Зима")
        2 -> println("Весна")
        3 -> println("Лето")
        4 -> println("Осень")
        else -> println("Ну тебя по человечески попросили же")
    }

    val invitedFriends = listOf("Қайрат", "Плов", "Алихан", "Байтұрсын")
    val guest = "Байтұрсын"
    if (invitedFriends.contains(guest)) {
        println("Добро пожаловать")
    } else {
        println("Вас нет в списке")
    }

    print("Введите число месяца: ")
    val month = readLine()!!.toInt() ?: 0
    val seasonn = when (month) {
        12, 1, 2 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Некорректный номер месяца"
    }
    println(seasonn)

    print("Введите название фрукта: ")
    val fruit = readLine()?.lowercase()

    val color = when (fruit) {
        "яблоко" -> "зеленое"
        "банан" -> "желтый"
        "апельсин" -> "оранжевый"
        "груша" -> "желтый или зеленый"
        "лонган" -> "светло-коричневый"
        "кумкват" -> "оранжевый"
        else -> "неизвестный фрукт"
    }

    println("Цвет фрукта: $color")
}