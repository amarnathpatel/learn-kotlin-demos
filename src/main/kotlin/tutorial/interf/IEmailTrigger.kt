package tutorial.interf

interface IEmailTrigger {
    fun  send();
    fun connect()  {
        println("Connect method called...........");
    }
}

class Transporter(a : Int, b : Int) : IEmailTrigger{
    override fun send() {
        println("send implemented.........");
    }

}

 fun mainInterface(){
  Transporter(1,2).send();
     Transporter(2,3).connect();
}