fun main() {
    print("Numero 1: ")
    var number1 = readLine()!!.toInt()
    print("Numero 2: ")
    var number2 = readLine()!!.toInt()

    val temp = number1
    number1 = number2
    number2 = temp

    println("Swap numbers is ==> Number: 1 $number1, Number2: $number2")
}