package calc
fun main() {
    var doU: String?
    var fnum: String?
    var opr: String?
     do {
        println("enter first number and operation needed to be conducted" )
        fnum = readLine()
        opr = readLine()
        Calculator.operator(fnum!!.toLong(),opr!!.toString())
        println("enter Y if u want to perform a calculation")
        doU = readLine()
    } while (doU=="Y"||doU=="y")
    println("do u want to display history y/n")
    var check= readLine()
    h@ if(check=="Y"||check=="y"){
        println("enter which calculation you want to display")
        var n= readLine()
        History.gethistory(n!!.toInt())
        println("do u want to display another history(type H) exit")
        check= readLine()
        if(check=="H"||check=="h"){
            return@h
        }

    }
   println("closing calculator")
}
