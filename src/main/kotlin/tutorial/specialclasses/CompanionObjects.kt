package tutorial.specialclasses

/**
 * An object declaration inside a class defines another useful case: the companion object.
 * Syntactically it's similar to the static methods in Java: you call object members using its class name as a qualifier.
 * If you plan to use a companion object in Kotlin, consider using a package-level function instead.
 *
 */

class BigBen {                                  //1 Defines a class.
    //Defines a companion. Its name can be omitted.
    companion object Bonger {                   //2
        //Defines a companion object method.
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    //Calls the companion object method via the class name.
    BigBen.getBongs(12)                         //4
}