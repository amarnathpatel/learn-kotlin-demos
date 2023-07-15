package tutorial
// Varargs allow you to pass any number of arguments by separating them with commas.

fun mainVarArgsFunction(){
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    printAllWithOtherParam("Hi", "Amar", "Nath", "Patel", subject="Just Learning man")

    log("Amar", "Nath", "Patel")

}
private fun printAll(vararg messages: String) {                            // 1
    for (m in messages)
        println(m)
}

//you can even add another parameter of the same type after the vararg
private fun printAllWithOtherParam(vararg messages: String, subject: String) {  // 3
    for (m in messages)
        println(subject + m)
}

//At runtime, a vararg is just an array.
// To pass it along into a vararg parameter,
// use the special spread operator * that
// lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
private fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
   // printAll(entries)    // Not allowed

}