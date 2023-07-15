package tutorial.specialclasses

/**
 * Data classes make it easy to create classes that are used to store values.
 * Such classes are automatically provided with methods for copying, getting a string representation, and using instances in collections.
 * You can override these methods with your own implementations in the class declaration.
 */

//Defines a data class with the data modifier.
data class User(val name: String, val id: Int, val age: Int) {  // 1
    override fun equals(other: Any?) =
        other is User && other.id == this.id      // 2 >> Override the default equals method by declaring users equal if they have the same id.
}
fun mainDataClasses() {
    val user = User("Alex", 1,24)
    println(user)              // 3 Method toString is auto-generated, which makes println output look nice.

    val secondUser = User("Alex", 1, 56)
    val thirdUser = User("Max", 2, 67)

    //Our custom equals considers two instances equal if their ids are equal.
    println("user == secondUser: ${user == secondUser}")   // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    //Data class instances with exactly matching attributes have the same hashCode.
    println(user.hashCode())                               // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    //Auto-generated copy function makes it easy to create a new instance.
    println(user.copy())                                   // 6

    //copy creates a new instance, so the object and its copy have distinct references.
    println(user === user.copy())                          // 7

    //When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
    println(user.copy("Max"))                              // 8

    //Use copy with named arguments to change the value despite of the properties order.
    println(user.copy(id = 3))                             // 9

    //Auto-generated componentN functions let you get the values of properties in the order of declaration.
    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
    println("age = ${user.component3()}")

}