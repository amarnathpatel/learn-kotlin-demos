package tutorial.specialclasses

/**
 *  Triple is a predefined class in Kotlin.
 *  With the help of Triple class in Kotlin, you can return 3 variables of same or different type from one function.
 *  Also, you can use Triple class to store 3 variables of same or different type.
 */

const val variable1 = "Declaring String variable"
const val variable2 = 1 // declaring integer value
const val variable3 = "Declaring second string value"

val variableName = Triple (variable1, variable2, variable3) // using declared variable in Triple class

fun mainTripleClass(){
    println(variableName.first) // will print the value of variable1
    println(variableName.second) // will print the value of variable2
    println(variableName.third) // will print the value of variable3

    println(variableName.toString())

    val list = variableName.toList()
    println(list[0]) // prints the first element of the list or variable1
    println(list[1]) // prints the second element of the list or variable2
    println(list[2]) // prints the third element of the list or variable3
}

fun fetchPersonDetails(): Triple<String, Int, Char> {
    val name = "Riya"
    val age = 18
    val gender = 'M'
    return Triple(name, age, gender)
}

fun mainRetrunMultipleUsingTriple() {
    val (name, age, gender) = fetchPersonDetails()
    println("($name, $age, $gender)")        // (Riya, 18, M)
}
