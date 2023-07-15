package tutorial
//Ever imagined calling a public function of a class without dot and parentheses of the parameter in Kotlin.
// Kotlin provides infix notation with which we can call a function with the class object without using a dot and parentheses across the parameter.
// Using infix function provides more readability to a function similar to other operators like in, is, as in Kotlin.

fun mainInfixFunctions() {
    //Defines an infix extension function on Int.
    infix fun Int.times(str: String) = str.repeat(this)        // 1
   //Calls the infix function.
    println( 5 times "Bye ")                                    // 2
    //Creates a Pair by calling the infix function to from the standard library.
    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    //Here's your own implementation of to creatively called onto.
    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    //Infix notation also works on members functions (methods).
    sophia likes claudia  //5
     println(sophia likes claudia )
}

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }  // 6


}