package tutorial.controlflow

fun mainRangesForInt(){

    //Iterates over a range starting from 0 up to 3 (inclusive).
    // Like 'for(i=0; i<=3; ++i)' in other programming languages (C/C++/Java).
    for(i in 0..5) {             // 1 // for(i in 0..3) {
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2  for(i in 0 until 3) {
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 i in 2..8 step 2 ==>Iterates over a range with a custom increment step for consecutive elements.
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      //  (i in 3 downTo 0)==> 4 Iterates over a range in reverse order.
        print(i)
    }
    print(" ")



// Ranges are also useful in if statements

    val x = 2
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
}

fun mainRangesForChar(){
    // Ranges are also supported in char
    //Iterates over a char range in alphabetical order.
    for (c in 'a'..'d') {        // 1==> c in 'a'..'d'
        print(c)
    }
    print(" ")
   // Char ranges support step and downTo as well.
    for (c in 'z' downTo 's' step 2) { // 2 ==>  c in 'z' downTo 's' step 2
        print(c)
    }
    print(" ")
}