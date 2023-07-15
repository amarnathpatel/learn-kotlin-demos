package tutorial.specialclasses

/**
 * Sealed classes let you restrict the use of inheritance.
 * Once you declare a class sealed, it can only be subclassed from inside the same package where the sealed class is declared.
 * It cannot be subclassed outside of the package where the sealed class is declared.
 */

//  Sealed classes are like abstract classes in Java.
//  They cannot be intantiated directly but we can instantiate subclasses
// Why do we sue sealed classes==> Whenever we want to define limited set of classes, we can define sealed classes
// When we fetch some data from network, network call may return success or failure
sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)
class Rapetile(val rapta: String, val job: String) : Mammal(rapta)


fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5
        is Rapetile -> return "Hello ${mammal.name}"
    }                                                                                   // 6
}



fun mainSealedClass() {
    println(greetMammal(Cat("Snowy")))
    //println(Mammal("Lion"))
}