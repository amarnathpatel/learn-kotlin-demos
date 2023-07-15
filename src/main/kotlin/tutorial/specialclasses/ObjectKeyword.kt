package tutorial.specialclasses

/**
 * Classes and objects in Kotlin work the same way as in most object-oriented languages:
 * a class is a blueprint,
 * and an object is an instance of a class.
 * Usually, you define a class and then create multiple instances of that class:


 */

import java.util.Random
class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun mainSimple() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
}

//##########################################################################################################
//In Kotlin you also have the object keyword. It is used to obtain a data type with a single implementation.
//If you are a Java user and want to understand what "single" means, you can think of the Singleton pattern: it ensures you that only one instance of that class is created even if 2 threads try to create it.
//To achieve this in Kotlin, you only need to declare an object: no class, no constructor, only a lazy instance. Why lazy? Because it will be created once when the object is accessed. Otherwise, it won't even be created.

//############################################################################################################
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun mainObjectExpression() {
    //Calls the function. This is when the object is actually created.
    rentPrice(10, 2, 1)                                                         //5
}

//##########################################################################################################
//object Declaration
//You can also use the object declaration.
// It isn't an expression, and can't be used in a variable assignment.
// You should use it to directly access its members:
//############################################################################################################
//Creates an object declaration.
object DoAuth {                                                 //1

//    Defines the object method.
    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }
}

fun mainObjectDeclaration(){
    //Calls the method. This is when the object is actually created.
    DoAuth.takeParams("foo", "qwerty")                          //3
}