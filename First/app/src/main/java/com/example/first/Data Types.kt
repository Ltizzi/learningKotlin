fun main() {
    // val = read only
    // var = variable
    /*
    adasd
   adasd
     */
    print("Ingrese nombre: ")
    //readLine() lee lo que se escribe
    // !! avisa q puede ser null
    var name:String= readLine()!!.toString()
    print("Ingrese su edad: ")
    var age:Int = readLine()!!.toInt()
    print("Ingrese su GPA: ")
    var GPA:Float = readLine()!!.toFloat()

    println("nombre: $name, edad: $age, GPA: $GPA")


}
