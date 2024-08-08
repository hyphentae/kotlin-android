fun main() {
    var myName = "Miras"
    println(myName)

    val favouriteQuote = "Лучше быть последним — первым, чем первым — последним"
    println("Моя любимая цитата - $favouriteQuote")

    var emptyString = (0..1).random()
    if (emptyString == 0) {
        println("Здесь ничего нет")
    }
    else {
        println("Она не пуста, как я думал")
    }

    var nameInCaps = "MIRAS"
    var name = "miras"
    if (nameInCaps == name){
        println("Эти две строки равны")
    }
    else {
        println("Эти две строки не равны")
    }

    if (nameInCaps.lowercase() == name.lowercase()){
        println("$nameInCaps и $name совпадают")
    }
    else {
        println("$nameInCaps и $name не совпадают")
    }

    val someName = "Martin Luther King Jr."
    if (someName.contains("Jr.")){
        println("Это имя используется второе поколение")
    }
    else{
        println("Это имя не используется второе поколение")
    }

    val textToSearchThrough = "Быть или не быть, вот в чем вопрос. Достойно ль\n" +
            "Смиряться под ударами судьбы,\n" +
            "Иль надо оказать сопротивленье\n" +
            "И в смертной схватке с целым морем бед\n" +
            "Покончить с ними? Умереть. Забыться."

    val textToSearchFor = "быть или не быть"

    if (textToSearchThrough.lowercase().contains(textToSearchFor.lowercase())) {
        println("Я нашел!")
    }

    println(myName)
    println(myName.count())

    val firstChar: Char = 'X'
    val secondChar: Char = 'Y'
    if (firstChar == secondChar){
        println("Эти два символа равны")
    }
    else {
        println("Эти два символа не равны")
    }
}