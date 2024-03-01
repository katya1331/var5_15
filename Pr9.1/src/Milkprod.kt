open class Milkprod(var type: String,var ves: Double,var proizv: String,var price: Double,var gir: Double){
    open fun srok(type:String){
        if (type == "молоко") {
            println("Не храните молочные продукты больше 4 дней!")
        }else if (type == "масло") {
            println("Не храните масо больше 4 месяцев!")
        }else if (type == "сгущенка") {
            println("Не храните сгущенку больше 10 дней в открытом виде!")
        }else if (type == "мороженое") {
            println("Не храните мороженое больше 1 дня в открытом виде!")
        }else{
            println("вы ввели не молочный продукт")
        }
    }
    fun Outpe(){
        println("type")
        type= readLine().toString()
        println("ves")
        ves = readLine()!!.toDouble()
        println("proizvod")
        proizv=readLine().toString()
        println("price")
        price=readLine()!!.toDouble()
        println("gir")
        gir=readLine()!!.toDouble()
    }
    open fun GetInfo(type: String,ves: Double,proizv: String,price: Double,gir: Double){
        println("type: $type")
        println("ves: $ves")
        println("proizvod: $proizv")
        println("price: $price")
        println("gir: $gir")
    }
}