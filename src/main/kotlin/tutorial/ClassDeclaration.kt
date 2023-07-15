package tutorial

class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun mainClassDeclaration() {

    val customer = Customer()                   // 3

    val contact = Contact(10, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    println(contact.email)                         // 5

    contact.email = "jane@gmail.com"            // 6
}