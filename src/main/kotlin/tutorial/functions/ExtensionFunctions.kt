package tutorial.functions

/**
 * Kotlin lets you add new members to any class with the extensions mechanism.
 * Namely, there are two types of extensions: extension functions and extension properties.
 * They look a lot like normal functions and properties but with one important difference: you need to specify the type that you extend.
 */

//Defines simple models of Item and Order. Order can contain a collection of Item objects.
data class Item(val name: String, val price: Float)                                         // 1
data class Order(val items: Collection<Item>)


//Adds extension functions for the Order type.
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Adds an extension property for the Order type.
val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()


fun mainExtnsionFunctions() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

}