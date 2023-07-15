package tutorial

//Kotlin classes are final by default. If you want to allow the class inheritance,
// mark the class with the open modifier.
open class Dog {                // 1

    //Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

// A class inherits a superclass when you specify the : SuperclassName() after its name.
// The empty parentheses () indicate an invocation of the superclass default constructor.
class Yorkshire : Dog() {       // 3
    // Overriding methods or attributes requires the override modifier.
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun mainInheritance() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}
// ********************* Inheritance with Parameterized Constructor**************************

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}
//If you want to use a parameterized constructor of the superclass when creating a subclass,
// provide the constructor arguments in the subclass declaration(Like below)
class BengalTiger : Tiger("WestBengal")                  // 1

fun mainInheritanceParam() {
    val tiger: Tiger = BengalTiger()
    tiger.sayHello()
}


// ********************* Passing Constructor Arguments to Superclass**************************

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// name in the BabbarSher declaration is neither a var nor val:
// it's a constructor argument, whose value is passed to the name property of the superclass Lion.
class BabbarSher(name: String) : Lion(name = name, origin = "India") // 1

fun mainInheritanceParam2() {
    //Creates an BabbarSher instance with the name "Modi".
    // The call invokes the Lion constructor with arguments "Modi" and India.
    val lion: Lion = BabbarSher("Modi")                              // 2
    lion.sayHello()
}


