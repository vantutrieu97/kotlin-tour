fun main() {
    val printMessage = { message: String -> println(message) }
    printMessage("Hello vantutrieu97")

    val sumNumber = { x: Int, y: Int, z: Int -> x + y + z }
    println(sumNumber(1997, 8, 7))

    fun downloadData(url: String, completion: () -> Unit) {
        //sent a download request
        //we got a back data
        //there were no network error
        completion()
    }

    downloadData("fakeUrl.com", {
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //sent a download request
        //we got a back car data
        var car = Car("VinFast", "Lux 2.0")
        completion(car)
    }
    downloadCarData("fakeURL.com") { car ->
        println(car.make)
        println(car.model)
    }
}