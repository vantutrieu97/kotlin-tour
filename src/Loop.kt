fun main() {
    val foodList = arrayListOf("Egg", "Meat", "Fish", "Vegetable")
    val brandList = hashMapOf<String,String>("key0" to "Honda","key1" to "Yamaha","key2" to "Testla","key3" to "VinFast")

    //syntax
    // for(<element> in <collection>){ logic }
    for(food in foodList){
        println(food)
    }

    for((key,value)in brandList){
        print(key)
        println(" $value")
    }


}