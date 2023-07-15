package tutorial.functions

/**
 * Lambda is a function which has no name.
 * Lambda is defined with a curly braces {} which takes variable as a parameter (if any)
 * and body of function. The body of function is written after variable (if any) followed by -> operator.
 *
 */

//The lambda is the part in curly braces,
// which is assigned to a variable of type (String) -> String (a function type).
val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

//Type inference inside lambda: the type of the lambda parameter is inferred from the type of the variable it's assigned to.
val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

//Type inference outside lambda: the type of the variable is inferred from the type of the lambda parameter and return value.
val upperCase3 = { str: String -> str.uppercase() }                     // 3

//You cannot do both together, the compiler has no chance to infer the type that way.
//val upperCase4 = { str -> str.uppercase() }                          // 4

//For lambdas with a single parameter, you don't have to explicitly name it.
// Instead, you can use the implicit 'it' variable.
// This is especially useful when the type of it can be inferred (which is often the case).
val upperCase5: (String) -> String = { it.uppercase() }                 // 5

//If your lambda consists of a single function call, you may use function pointers (::) .
val upperCase6: (String) -> String = String::uppercase                  // 6

fun mainLambdaFunction() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}