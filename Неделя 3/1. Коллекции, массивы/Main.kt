fun main() {
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    val sum = numbersArray.sum()
    println("Сумма всех элементов массива: $sum")

    val stringsArray = arrayOf("Ялбоко", "Бнаан", "Чреешня")
    val reverseArray = stringsArray.reversed()
    println("Элементы массива в обратном порядке: $reverseArray")

    val booleanArray = arrayOf(true, false, true, true)
    val allTrue = booleanArray.all { it }
    println("Все элементы равны true: $allTrue")
    val grouped = booleanArray.groupBy { it }
    println("Группировка элементов: $grouped")

    val stringList = mutableListOf("Лонган", "Карамбола", "Питайя")
    stringList.add("Чомпу")
    stringList.add("Саподилла")
    stringList.removeAt(0)
    println("Список после удаления первого элемента: $stringList")

    val numberList = arrayListOf(1, 2, 5, 7, 7, 88, 72, 550, 3)
    val average = numberList.average()
    println("Среднее значение всех элементов: $average")

    val countFives = numberList.count { it == 5 }
    println("Количество раз, когда число 5 встречается в списке: $countFives")
}
