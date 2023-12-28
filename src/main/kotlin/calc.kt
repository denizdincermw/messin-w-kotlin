import java.util.*


class Calc{
    var sc = Scanner(System.`in`)
    fun calcore(firstNum:Int,secNum:Int){

        println("Summary = ${(firstNum+secNum).toDouble()}")
        println("Sub = ${(firstNum-secNum).toDouble()}")
        println("Multiply = ${(firstNum*secNum).toDouble()}")
        println("Division = ${(firstNum/secNum).toDouble()}")
        println("Mod = ${(firstNum%secNum).toDouble()}")

    }
}