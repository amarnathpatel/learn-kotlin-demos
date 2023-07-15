package tutorial.other

class SomeClass {
    // Using lazy keyword
    private val heavyObject: HeavyClass by lazy {
        println("Heavy Object initialised")
        HeavyClass()
    }

    //  Normal object creation - we are creating a heavy object
    //  and this will result in slow or delayed creation of the SomeClass.
    //private val heavyObject : HeavyClass = HeavyClass()
    private class HeavyClass(){

    }
    fun accessObject() {
        println(heavyObject)
    }
}

fun mainLazy() {
    val someClass = SomeClass()
    println("SomeClass initialised")
    someClass.accessObject()
    someClass.accessObject()
}
