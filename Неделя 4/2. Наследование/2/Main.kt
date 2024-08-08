interface VehicleAction {
    fun start()
    fun stop()
    fun getFuelLevel(): Int
}

open class Vehicle(val make: String, val model: String) : VehicleAction {
    open val fuelCapacity: Int = 0
    private var fuelLevel: Int = 0

    override fun start() {
        println("The vehicle $make $model is starting.")
    }

    override fun stop() {
        println("The vehicle $make $model is stopping.")
    }

    override fun getFuelLevel(): Int {
        return fuelLevel
    }

    fun refuel(amount: Int) {
        fuelLevel += amount
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity
        }
        println("Refueled $amount units. Current fuel level: $fuelLevel")
    }
}

class Car(make: String, model: String) : Vehicle(make, model) {
    override val fuelCapacity: Int = 50

    override fun start() {
        println("The car $make $model roars to life!")
    }

    override fun stop() {
        println("The car $make $model is parked.")
    }
}

class Motorcycle(make: String, model: String) : Vehicle(make, model) {
    override val fuelCapacity: Int = 20

    override fun start() {
        println("The motorcycle $make $model revs up!")
    }

    override fun stop() {
        println("The motorcycle $make $model comes to a halt.")
    }
}

fun main() {
    val myCar = Car("Toyota", "Corolla")
    val myMotorcycle = Motorcycle("Yamaha", "R1")

    myCar.start()
    myCar.refuel(30)
    println("Current fuel level in car: ${myCar.getFuelLevel()}")
    myCar.stop()

    myMotorcycle.start()
    myMotorcycle.refuel(15)
    println("Current fuel level in motorcycle: ${myMotorcycle.getFuelLevel()}")
    myMotorcycle.stop()
}
