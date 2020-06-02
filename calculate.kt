package calc



/*var i: Int=0
val history: MutableMap<> = mapOf(i to "no operation done yet")


class calculation(val fnum: String){
    var oper: String -> String={b -> b}
    fun def_operation(){
        val k:Any
        when(oper){
            "+" -> return (operator.addition(fnum.toLong()))
            "-" -> return (operator.subtractio(fnum.toLong()))
            "*" -> return (operator.multiplication(fnum.toLong()))
            "/" -> return (operator.division(fnum.toLong()))
            "%" -> return (operator.percentage(fnum.toLong()))
            else-> {
                println("invalid operation entered")
                return
            }
        }

    }
    private fun actual_calculation(){
        val k: Any=def_operation()
        val y: (Long) -> Long = { k -> k / 1 }
        val j = k.calculate_val(y)
        println(j)
        i.inc()
        history.put(i to "$fnum $oper $y = $j")

    }
    val hist:(Int) -> Int={ a: Int -> history[a]}

}'''
*/
object Calculator{
    var op: operator = operator.addition(0)
    var snum: String?="0"



    fun onAction(fn: operator) {

        op = fn


    }



     fun operator(fnum: Long, x: String) {

            when(x) {

                "+" -> onAction(operator.addition(fnum))

                "-" -> onAction(operator.subtractio(fnum))

                "/" -> onAction(operator.division(fnum))

                "%" -> { onAction(operator.percentage(fnum)) }

                "X" -> onAction(operator.multiplication(fnum))

                else -> {println("invalid entry")
                         return
                }


                }
         println("enter second number")
         snum= readLine()
         var z=op.calculate_val(snum!!.toLong()).toString()
         println(z)
         History.historyupdate(fnum.toString(), snum.toString(), x.toString(), z.toString())

            }



    }
object History{
    var i:Int =0
    var hist: MutableMap<Int, String> = mutableMapOf(i to "no history")
    private fun increment(){
        i=i.inc()
    }
    fun historyupdate(fnum: String, snum: String, x:String, z: String){
        increment()
        hist.put(i,"$fnum $x $snum = $z")
    }
    fun gethistory(j: Int){
        if(j>i){
            println("not able to retrieve info because of overflow")
            return
        }
        println(hist[j])
    }
}




