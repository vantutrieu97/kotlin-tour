fun main() {
    fun simpleFunction() {
        println("This is simple function (print boring text)")
    }

    // syntax
    //    fun <function name> (<parameter name> : <Type>,...) : <return type>{
    //        logic
    //        return ...
    //    }

    fun calculateNumber(firstParameter: Int, secondParameter: Int, thirdParameter: Int = 12): Int {
        println(firstParameter)
        println(secondParameter)
        val total = firstParameter + secondParameter + thirdParameter
        println("Total is $total")
        return total
    }

    simpleFunction()
    calculateNumber(1997, 8, 7)
    calculateNumber(1997, 8)
}