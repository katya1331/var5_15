class Kislomolochnoe(type: String,ves: Double,proizv: String,price: Double,gir: Double, kislost:String):Milkprod(type,ves,proizv,price,gir) {
    open override fun srok(type:String){
        if (type == "творог") {
            println("Не храните творог больше 6 дней!")
        }else if (type == "сметана") {
            println("Не храните сметану больше 4 дней!")
        }else if (type == "ряженка") {
            println("Не храните ряженку больше 10 дней в открытом виде!")
        }else if (type == "кефир") {
            println("Не храните кефир больше 10 дней в открытом виде!")
        }else if (type == "сыр") {
            println("Не храните сыр больше 2 месяцев!")
        }else if (type == "йогурт") {
            println("Не храните йогурт больше 2 месяцев!")
        }else{
            println("вы ввели не кисломоочный продукт")
        }
    }
    open fun GetInfo(type: String,ves: Double,proizv: String,price: Double,gir: Double,kislost:String){
        println("type: $type")
        println("ves: $ves")
        println("proizvod: $proizv")
        println("price: $price")
        println("gir: $gir")
        println("kislost: $kislost")
    }
}