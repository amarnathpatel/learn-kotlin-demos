package tutorial.specialclasses

/**
 * Enum classes are used to model types that represent a finite set of distinct values,
 * such as directions, states, modes, and so forth.
 */

enum class State {
    NEW_REQUEST, PICKUP_PLAN, PIKCUP_ACTUAL, RECEIPT, COMPLETED                            // 1
}

fun mainEnumClass() {
    val state = State.NEW_REQUEST                         // 2
    val message = when (state) {                      // 3
        State.PIKCUP_ACTUAL -> "It's Pickup Actual"
        State.RECEIPT -> "It's Receipt stat"
        State.COMPLETED -> "It's Completed state"
        State.PICKUP_PLAN -> "It's Pickup Plan state"
        State.NEW_REQUEST -> "It's New Request state"
        //else -> "Other States"
    }
    println(message)
}

//###########################################################
// Enums may contain properties and methods like other classes,
// separated from the list of enum constants by a semicolon.
//#########################################################


/**
 * Defines an enum class with a property and a method.
 */
enum class Color(private val rgb: Int,private val type: String) {                      // 1

    //Each enum constant must pass an argument for the constructor parameter.
    RED(0xFF0000,"Pure"),                                    // 2
    GREEN(0x00FF00,"Mix"),
    BLUE(0x0000FF,"Mix"),
    YELLOW(0xFFFF00,"Pure");
// Enum class members are separated from the constant definitions by a semicolon.

   fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3

   /*

   fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 !=0
    }

    */
}

fun mainEnumClassWithProperty() {
    val red = Color.RED
    //The default toString returns the name of the constant, here "RED".
    println(red)                                      // 4

    //Calls a method on an enum constant
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6

    //The RGB values of RED and YELLOW share first bits (FF) so this prints 'true'.
    println(Color.YELLOW.containsRed())               // 7


    println(Color.GREEN.containsRed())                 // 8

}

