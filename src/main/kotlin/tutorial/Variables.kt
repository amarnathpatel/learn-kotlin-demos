package tutorial

fun mainVariable() : Unit {
   // Declares a mutable variable and initializes it. Same as normal variable declaration in Java
    var a: String = "initial"  // 1
    println(a)
    //Declares an immutable variable and initializes it.  val is like final variable in JAVA
    val b: Int          // 2
    //println(b)// not allowed
    //Declares an immutable variable and initializes it without specifying the type.
    // The compiler infers the type Int.
    val c = 3                  // 3

    //Declares a variable without initialization.
    //An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.

    val d: Int  // 1
    //println(d) //>>>>>>>>> Not allowed to read without initialize
    val i : Int = 10;
    if(i == 10) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }
    println(d) // 3
}