fun main() {
    // syntax
    // var label = value
    var username = "vantutrieu97" // var ---> mutable
    val homeTown = "Cho Don, Bac Kan" // var ---> immutable


    println(username);
    println(homeTown);

    var currentWorkPlace = "Ho Chi Minh City (HCMC)"
    //compare two strings
    var contentEquals = homeTown.contentEquals(currentWorkPlace)
    println(contentEquals)

    var rawCrawl = """This is my Kotlin learning 
        | process, thanks for visiting
        | my repository.
    """.trimMargin("| ")
    println(rawCrawl)
    println("<>-------------------<>\n$username - hometown: $homeTown\n$rawCrawl")


}