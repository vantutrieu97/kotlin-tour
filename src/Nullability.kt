fun main() {
    var nullableName: String? = "Do I really exist"
    nullableName = null
    println(nullableName)

    var len = 0;
    if (nullableName != null) {
        len = nullableName.length
    } else {
        len = -1
    }
    println("Length : $len")

    //Safe call operator
    println(nullableName?.length)

    //Elvis operator
    println(nullableName?.length ?: -1)

    //Make kotlin.KotlinNullPointerException
    println(nullableName!!)
}
