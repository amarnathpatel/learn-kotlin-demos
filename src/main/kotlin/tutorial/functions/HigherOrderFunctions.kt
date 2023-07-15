package tutorial.functions

/**
 * A higher-order function is a function that takes another function as parameter and/or returns a function.
 */

//Declares a higher-order function. It takes two integer parameters, x and y. Additionally,
// it takes another function 'myfunction' as a parameter.
// The myfunction parameters and return type are also defined in the declaration.
fun calculate(x: Int, y: Int, z:Int, myfunction: (Int, Int, Int) -> Int): Int {  // 1
    //The higher order function returns the result of myfunction invocation with the supplied arguments
    return myfunction(x, y,z)                                          // 2
}

//Declares a function that matches the myfunction signature.
fun sum(x: Int, y: Int, z:Int) = x + y + z                                     // 3

fun mainHOFunction() {

    //Invokes the higher-order function passing in two integer values and
    // the function argument ::sum. :: is the notation that references a function by name in Kotlin
    val sumResult = calculate(4,6 ,7 , ::sum)                          // 4

    //Invokes the higher-order function passing in a lambda as a function argument.
    val mulResult = calculate(4,7,9) { a, b,c -> a * b * c }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}


//###########################Returning functions#########################

/**
 * Declares a higher-order function that returns a function.
 * (Int) -> Int represents the parameters and return type of the square function.
 */
fun myNewFunction(): (Int) -> Int {                                     // 1
    return ::square
}

// Declares a function matching the signature.
fun square(x: Int) = x * x                                          // 2

fun mainHOFunctionReturning() {

    //Invokes myNewFunction to get the result assigned to a variable.
    // Here func becomes square which is returned by myNewFunction.
    val func = myNewFunction()                                          // 3
    println(func)

    //Invokes func. The square function is actually executed.
    println(func(2))                                                // 4
}
