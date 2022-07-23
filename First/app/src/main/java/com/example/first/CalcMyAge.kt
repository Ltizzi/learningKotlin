import java.util.*

fun main(){
    println("Enter year of birth: ")
    val yearOfBirth = readLine()!!.toInt()
    val actualYear = Calendar.getInstance().get(Calendar.YEAR)
    val age = actualYear - yearOfBirth
    println("You are $age years old")
}