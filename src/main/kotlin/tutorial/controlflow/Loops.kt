package tutorial.controlflow

/**
 * for in Kotlin works the same way as in most languages.
 */
val cakes = listOf("carrot", "cheese", "chocolate")
fun mainForLoop() {
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }
}

/**
 * while and do-while constructs work similarly to most languages as well.
 */
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun mainWhileLoop(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }

    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}

/*
You can define your own iterators in your classes by implementing the iterator operator in them.
 */

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    // Defines an iterator in a class. It must be named iterator and have the operator modifier.
    operator fun iterator(): Iterator<Animal> {             // 1
        //Returns the iterator that meets the following method requirements:
        //next(): Animal
        //hasNext(): Boolean
        return animals.iterator()                           // 2
    }
}

fun mainIterator() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    //Loops through animals in the zoo with the user-defined iterator.
    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}