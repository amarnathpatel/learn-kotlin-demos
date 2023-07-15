package tutorial.controlflow

/*
Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction.
 It can be used either as a statement or as an expression.
 */

fun mainWhenStatement() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {

    when (obj) {                                     // 1 ==> This is a when statement.
        1 -> println("One")                          // 2 ==> Checks whether obj equals to one.
        "Hello" -> println("Greeting")               // 3 ==> Checks whether obj equals to Hello.
        is Long -> println("Long")                   // 4 => Performs type checking.
        !is String -> println("Not a string")        // 5 ==> Performs inverse type checking
        else -> println("Unknown")                   // 6 ==> Default statement (might be omitted).
    }
}

fun mainWhenExpression() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1 ==> This is a when expression.
        1 -> "one"                              // 2 ==> Sets the value to "one" if obj equals to one.
        "Hello" -> 1                            // 3 ==> Sets the value to one if obj equals to Hello.
        is Long -> false                        // 4 ==> Sets the value to false if obj is an instance of Long.
        else -> 42                              // 5==> Sets the value "42" if none of the previous conditions are satisfied. Unlike in when statement, the default branch is usually required in when expression, except the case when the compiler can check that other branches cover all possible cases.
    }
    return result
}

class MyClass