package tutorial

fun mainNullSafety() : Unit {
    //Declares a non-null String variable.
    var neverNull: String = "This can't be null"            // 1
    //When trying to assign null to non-nullable variable, a compilation error is produced.
   //===>  neverNull = null                                        // 2

   // Declares a nullable String variable.
    var nullable: String? = "You can keep a null here"      // 3
   // Sets the null value to the nullable variable. This is OK.
    nullable = null                                         // 4

    // When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    var inferredNonNull = "The compiler assumes non-null"   // 5
    // inferredNonNull = null       ===> Compiler goves issue                           // 6
    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }
    strLength(neverNull)                                    // 8
    //strLength(nullable)       // ===>compile issue                              // 9
}
