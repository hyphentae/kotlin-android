interface WarriorAction {
    fun doAttack(name: String)
    fun sayAboutOwn(name: String)
    fun doDied(name: String)
}

open class Warrior(val name: String, val age: Int) : WarriorAction {
    override fun doAttack(name: String) {
        println("$name attacks the enemy!")
    }

    override fun sayAboutOwn(name: String) {
        println("I am $name, a mighty warrior!")
    }

    override fun doDied(name: String) {
        println("$name has fallen in battle!")
    }
}

class Knight(name: String, age: Int) : Warrior(name, age) {
    override fun doAttack(name: String) {
        println("$name charges with a sword!")
    }

    override fun sayAboutOwn(name: String) {
        println("I am $name, a brave knight!")
    }

    override fun doDied(name: String) {
        println("$name, the knight, died with honor!")
    }
}

class Archer(name: String, age: Int) : Warrior(name, age) {
    override fun doAttack(name: String) {
        println("$name shoots an arrow!")
    }

    override fun sayAboutOwn(name: String) {
        println("I am $name, a skilled archer!")
    }

    override fun doDied(name: String) {
        println("$name, the archer, was struck down!")
    }
}

fun main() {
    val knight = Knight("Sir Lancelot", 35)
    val archer = Archer("Robin Hood", 30)

    knight.doAttack(knight.name)
    knight.sayAboutOwn(knight.name)
    knight.doDied(knight.name)

    archer.doAttack(archer.name)
    archer.sayAboutOwn(archer.name)
    archer.doDied(archer.name)
}
