package tutorial.controlflow

class EqualityCheck {
 // Kotlin uses == for structural comparison and === for referential comparison.
    fun mainEqualityCheck(){
        val authors = setOf("Shakespeare", "Hemingway", "Twain")
        val writers = setOf("Twain", "Shakespeare", "Hemingway")

        println(authors == writers)   // 1==> Returns true because it calls authors.equals(writers) and sets ignore element order.
        println(authors === writers)  // 2==> Returns false because authors and writers are distinct references.
 }

}