package calc

sealed class operator(val x: Long){
    // sealed calss are use to restrict classes,it helps in fixing type hierarchies
    abstract fun calculate_val( y: Long):Long//so that it can be inherited

    class addition(x: Long) : operator(x){
        override fun calculate_val(y: Long): Long {
            return x+y
        }
    }
    class subtractio(x: Long) : operator(x){
        override fun calculate_val(y: Long): Long {
            return x-y
        }
    }
    class multiplication(x: Long) : operator(x){
        override fun calculate_val( y: Long): Long {
            return x*y
        }
    }
    open class division(x: Long) : operator(x){
        override fun calculate_val(y: Long): Long {
            return x/y
        }
    }
    class percentage(x: Long) : operator(x){

        override fun calculate_val(y: Long)=x/100
    }
}