package tutorial.specialclasses

  sealed class Data{
     class Success(val data: String): Data()
     class FAILURE(val error: String): Data()
     object LOADING: Data()
 }

fun getData(): Data{
    return Data.Success((100..1000).random().toString())
}

fun mainSealedClass2(){
    val data = getData()
    when(data){
        is Data.Success -> println(data)
        is Data.FAILURE -> println(data)
        is Data.LOADING -> println(data)
    }
}
