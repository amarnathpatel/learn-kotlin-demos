package tutorial.other

public class LateInitClass{

    //private var normalVariable : String = ""; // Its nullable type
    //private var normalVariable : String? = null; // Its nullable type
    private lateinit var   lateInitVariable : String;

    fun setLateinitVariable(value: String){
        lateInitVariable = value
    }

    fun getLateinitVariable() : String{
        println("getLateinitVariable called")
        if(this::lateInitVariable.isInitialized)
        return lateInitVariable
        else return "Default"
    }

    fun mainLateInitClass(){
        setLateinitVariable("Amar")
        println(getLateinitVariable())
    }
}