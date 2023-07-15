package tutorial

//Generic classes and functions increase code reusability by encapsulating common logic that is independent of a particular generic type,
// like the logic inside a List<T> is independent of what T is.
/* Generic programming is a style of computer programming in which algorithms are written in terms of types
to-be-specified-later that are then instantiated when needed for specific types provided as parameters. */


/*
Defines a generic class MutableStack<E> where E is called the generic type parameter. At use-site,
it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
 */
class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    // Inside the generic class, E can be used as a parameter like any other type.
    fun push(element: E) = elements.add(element)        // 2

    // You can also use E as a return type.
    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"

}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun mainGenericSamples() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}