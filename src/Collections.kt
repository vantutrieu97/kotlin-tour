fun main() {
    val simpleList = arrayListOf("Egg", "Meat", "Fish", "Vegetable")
    //sort by alphabet
    println("After sort: ${simpleList.sorted()}")

    //get last element
    println("Last element: ${simpleList.last()}")

    //get element by index
    println("Element in simpleList[2] is: ${simpleList[2]}")

    //check list contain element or not
    println("Contain Fish? --> answers: ${simpleList.contains("Fish")}")

    //get size
    println("Size: ${simpleList.size}")

    //add new element
    println("List after added: ${simpleList.add("Air")}")

    //get index by element
    println("Index by element ( simpleList.indexOf(\"Fish\") ): ${simpleList.indexOf("Fish")}")
    println(simpleList)

    //remove element
    println("List after removed ( simpleList.remove(\"Meat\") ): ${simpleList.remove("Meat")} $simpleList")
    println(simpleList)
}