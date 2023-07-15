package tutorial

//A simple function that takes a parameter of type String and returns Unit (i.e., no return value).
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

//A function that takes a second optional parameter with default value Info. The return type is omitted, meaning that it's actually Unit.
fun printMessageWithPrefix(fNAme: String, lName: String = "Nath") {  // 2
    println("$fNAme $lName")
}

//A function that returns an integer.
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

//A single-expression function that returns an integer (inferred).
fun multiply(x: Int, y: Int) : Int {
    return x * y
}

//A single-expression function that returns an integer (inferred).
fun multiplyV2(x:Int, y:Int) = x * y;

fun mainFunctions() {
   printMessage("Hello")
   //Calls the function with two parameters, passing values for both of them.
    printMessageWithPrefix("Rahul", "Shukla")
    //Calls the same function omitting the second one. The default value Info is used.
    printMessageWithPrefix("Rahul")                                     // 7
    //Calls the same function using named arguments and changing the order of the arguments.
    printMessageWithPrefix(lName = "Shukla", fNAme = "Rahul")           // 8
    //Prints the result of the sum function call.
    println(sum(1, 2))                                                  // 9
    //Prints the result of the multiply function call.
    println(multiply(5,6))
    println(multiplyV2(23 ,67))
}
