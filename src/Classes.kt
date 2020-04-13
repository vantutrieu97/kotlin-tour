open class Vehicle(val make: String, val model: String) {
    fun sound() {
        println("vroom vroom");
    }

   open fun move(){
        println("Moving from A to B")
    }
}

class Car(make: String, model: String) : Vehicle(make, model) {
    override fun move() {
        super.move()
        println("Then move B to A")
    }
}

fun main() {
    var car = Car("VinFast", "Lux 2.0")
    println(car.make)
    println(car.sound())
    println(car.move())
}