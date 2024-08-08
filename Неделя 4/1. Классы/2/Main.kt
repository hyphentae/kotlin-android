data class Car(val make: String, val model: String, val year: Int)

fun main() {
    val cars = listOf(
        Car("Toyota", "Camry", 2020),
        Car("Honda", "Civic", 2001),
        Car("Porsche", "911", 2014),
        Car("Chevrolet", "Cobalt", 2022),
        Car("Toyota", "Supra", 2021)
    )
    
    println("Информация об автомобилях:")
    for (car in cars) {
        println(car)
    }
}
