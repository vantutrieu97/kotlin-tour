fun main() {
    val year = 1997
    val month = 8
    val day=7

    print("Resutl: ")
    if (year == month) {
        println("a equal b")
    }else{
        println("a not equal b")
    }

    when(day){
        6 -> println("Day is 6")
        7 -> println("Day is 7")
        8 -> println("Day is 8")
        else -> println("Hmmmm, I don't know the value of the day variable")
    }

}