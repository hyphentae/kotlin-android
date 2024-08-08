class Warrior(val name: String, val age: Int, val typeWarrior: String)

fun main() {
    val warrior1 = Warrior("Викинг", 47, "Викинг")
    val warrior2 = Warrior("Тор", 40, "Тор")
    val warrior3 = Warrior("Хоббихорсер", 12, "Воин")
    val warrior4 = Warrior("Ясукэ", 25, "Самурай")
    val warrior5 = Warrior("Ахилес", 35, "Грек" )

    println("Информация о воинах:")
    println("${warrior1.name}, Возраст: ${warrior1.age}, Тип воина: ${warrior1.typeWarrior}")
    println("${warrior2.name}, Возраст: ${warrior2.age}, Тип воина: ${warrior2.typeWarrior}")
    println("${warrior3.name}, Возраст: ${warrior3.age}, Тип воина: ${warrior3.typeWarrior}")
    println("${warrior4.name}, Возраст: ${warrior4.age}, Тип воина: ${warrior4.typeWarrior}")
    println("${warrior5.name}, Возраст: ${warrior5.age}, Тип воина: ${warrior5.typeWarrior}")
}
