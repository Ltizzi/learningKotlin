fun main() {
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    if (age > 16) {
        println("You are older than 16")
    }
    else{
        println("You are a kid, kiddo")
    }


}