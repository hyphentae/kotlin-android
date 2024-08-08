class Warrior(
    val name: String = "Неизвестно",
    val age: Int = 18,
    val typeWarrior: String = "Неизвестно"
)

fun main() {
    val warrior1 = Warrior("Геркулес", 30)
    val warrior2 = Warrior("Леонид", 40, "Спартанец")
    val warrior3 = Warrior("Квадробер", 12, "Эльф")
    val warrior4 = Warrior()
    val warrior5 = Warrior(age = 25)

    println("Информация о воинах:")
    println("${warrior1.name}, Возраст: ${warrior1.age}, Тип воина: ${warrior1.typeWarrior}")
    println("${warrior2.name}, Возраст: ${warrior2.age}, Тип воина: ${warrior2.typeWarrior}")
    println("${warrior3.name}, Возраст: ${warrior3.age}, Тип воина: ${warrior3.typeWarrior}")
    println("${warrior4.name}, Возраст: ${warrior4.age}, Тип воина: ${warrior4.typeWarrior}")
    println("${warrior5.name}, Возраст: ${warrior5.age}, Тип воина: ${warrior5.typeWarrior}")
}