import kotlinx.coroutines.channels.consumesAll

fun main(){
    println("Simple Calculator")
    print("Numero 1: ")
    val number1 = readLine()!!.toDouble()
    print("Numbero 2: ")
    val number2 = readLine()!!.toDouble()
    val sum:Double = number1 + number2
    println("Suma: $sum")
    val sub:Double = number1 - number2
    println("Resta: $sub")
    val mul:Double = number1*number2
    println("MUlt: $mul")
    val div:Double = number1/number2
    println("Div: $div")
}
