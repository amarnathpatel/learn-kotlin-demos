package tutorial.functions

// anonymous function with body as an expression
val anonymous1 = fun(x:Int, y:Int) : Int = x+y;

// anonymous function with body as body
val anonymous2 = fun(x: Int, y: Int): Int {
    return x * y
}

// with type annotation in lambda expression
   val lambda1 = { a: Int, b: Int -> a + b }

// Type declaration in lambdas –
// Pattern: (Input) -> Output
    val lambda2: (Int) -> Int = { a -> a * a }
    val lambda3: (String,String) -> String = { a , b -> a + b }
    val lambda4: (Int)-> Unit = {print(Int)}


    /*
    Explanation:
    In the below example, we are using the lambda expression as class extension.
    We have passed the parameters according to the format given . this keyword is used
    for the string and it keyword is used for the Int parameter passed in the lambda.
    Then the code_body concatenates both the values and returns to variable result.

     it: implicit name of a single parameter –
     In most of cases lambdas contains the single parameter. Here,
     it is used to represent the single parameter we pass to lambda expression.
     */
    // Lambdas can be used as class extension:
    val lambda5: String.(Int) -> String = {this + it}
    val lambda6: String.(Int) -> String = {this + Int}


   // shorthand of lambda function
   val numbers = arrayOf(1,-2,3,-4,5)

  //by default returns from the nearest enclosing function or anonymous function

fun largestNumber(a: Int, b: Int, c: Int): Int {
    fun largest(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }
    return largest(largest(a, b), largest(b, c))
}


// If the innermost function is an anonymous function, then that still counts for return purposes:
fun printLessThanTwo() {
    val list = listOf(1, 2, 3, 4)
    list.forEach(fun(x) {
        if (x < 2) println(x)
        else return
    })
    println("This line will still execute")
}

fun tweak() : String{
    println("Tweak function called")
    return "Hi Tweak"
}
 val tweakNew =  {
    println("Tweak function called")
}

fun mainAnonymousFunction() {
    //invoking functions
    val sum = anonymous1(3, 5)
    val mul = anonymous2(3, 5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")

    // invoking Lambda functions
    println("1- The sum of two numbers using Lambda- ${lambda1(4, 8)}")
    println("2- The squire of a number using Lambda- ${lambda2(4)}")
    println("3- The concatenation of two string using Lambda- ${lambda3("Amar", "Nath")}")
    println("3- The concatenation of two string using Lambda- ${lambda3("3", "5")}")
    println("4- No return from Lambda : ${lambda4(8)}")
    val result = "Amar".lambda5(8)
    println("5- Using Lambda with class extension : $result")
    val result2 = "Amar".lambda6(10)
    println("5- Using Lambda with class extension : $result2") // Query -To clear

    //Shorthand Lambda call
    println(numbers.filter { it > 0 })
    //Longhand Lambda call
    println(numbers.filter {item -> item > 0 })
    printLessThanTwo()
    println(largestNumber(8, 3, 10))

    // Calling tweak function
    //val tweakFunction = tweak; <<< Compilation error>>>
      val tweakFunction = ::tweak  // Using function reference operator
      println("tweakFunction: $tweakFunction" )
      val tweakFunctionCall = tweak()  // Using function invocation
    println("tweakFunction: $tweakFunctionCall" )
}
