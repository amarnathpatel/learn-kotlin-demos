package tutorial.scopeFunctions

/**
 * The Kotlin standard library function let can be used for scoping and null-checks.
 *
 * When called on an object, let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it (by default) or a custom name.

 */

val empty = "test".let {               // 1
    customPrint(it)                    // 2
    it.isEmpty()                       // 3
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {                         // 4
        print("\t")
        customPrint(it)
        println()
    }
}

fun customPrint(vars: Any){
    println(vars);
}
fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->       // 5
        strTwo?.let { secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}

fun mainLetFunction(){
    println(" is empty: $empty")
    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")
}
