package tutorial

fun mainOperatorFunctions() {
  //  An operator function is a user-defined function, such as plus() or equal(),
    //  that has a corresponding operator symbol. For an operator function to operate
    //  on the opaque data type, you must overload the routine for the opaque data type.

    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(10 * "Bye ")                                          // 2

    //An operator function allows easy range access on strings.
    operator fun String.get(range: IntRange) = substring(range)  // 3

    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..26])                                        // 5
}
