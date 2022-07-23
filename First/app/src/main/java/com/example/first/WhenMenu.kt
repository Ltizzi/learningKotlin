fun main() {
    print("Entre un numero de 1 al 3: ")
    val foodID = readLine()!!.toInt()

    when(foodID){

        1 -> {
            println("You got a sandwich")
        }
        2-> {
            println("You got a cake")
        }
        3 -> {
            println("you got a fruit")
        }
    }

    print("Enter your grade: ")
    val grade = readLine()!!.toInt()

    when{
        grade>=9 -> println("Excelente!!! =D <3")
        grade == 8 -> println("Muy bien =)")
        grade in 6..7 -> println("Bien :)")
        grade in 4..5 -> println("Regular :(")
        else -> println("Desaprobado =(")
    }
}