fun main() {
    introduceMyself()

    print("Сколько шагов вы хотите сделать? ")
    val goal = readLine()!!.toInt()
    print("И сколько шагов вы сделали? ")
    val steps = readLine()!!.toInt()

    progressUpdate(steps, goal)

    print("Введите первое число: ")
    val firstNum = readLine()!!.toInt()
    print("Введите втоое число: ")
    val secondNum = readLine()!!.toInt()
    numCompare(firstNum, secondNum)

    val inputString = "hello world"
    val charToFind = 'o'

    val chars = countOccurrences(inputString, charToFind)
    println("Количество вхождений символа '$charToFind' в строке \"$inputString\": $chars")

    val num1 = 15
    val num2 = 21
    val num3 = 37
    val num4 = 87

    val sum = sumOfFourNumbers(num1, num2, num3, num4)
    println("Сумма чисел: $sum")

    val helloString = "Hello"
}

fun introduceMyself(){
    val name = "Miras"
    val surname = "Zhumazhan"
    val birthday = "5 October"
    println("$name $surname. Birthday: $birthday")
}

fun progressUpdate(steps: Int, goal: Int) {
    val percent = (steps.toDouble() / goal) * 100
    when (percent) {
        in 0.0..10.0 -> println("У вас хорошее начало")
        in 10.0..50.0 -> println("Вы почти на полпути!")
        in 50.0..90.0 -> println("Вы на полпути!")
        in 90.0..100.0 -> println("Вы почти у цели!")
        else -> println("Вы превзошли свою цель!")
    }
}

fun numCompare(firstNum: Int, secondNum: Int) {
    if (firstNum > secondNum) {
        println("Первое число больше, чем второе")
    }
    else if (firstNum < secondNum) {
        println("Второе число больше, чем второе")
    }
    else {
        println("Числа равны")
    }
}

fun countOccurrences(inputString: String, charToFind: Char): Int {
    return inputString.count { it == charToFind }
}

fun sumOfFourNumbers(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

fun isHello(inputString: String) {
    if (inputString == "Hello"){
        println("This is a certified Hello moment")
    }
}


