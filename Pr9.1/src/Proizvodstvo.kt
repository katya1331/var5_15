class Proizvodstvo(type: String,ves: Double,proizv: String,price: Double,gir: Double):Milkprod(type,ves,proizv,price,gir)
{   public fun Sebest(price:Double):Double {
        if (ves<0.5){
          val price = price*0.6
            println("sebest: $price")
        }else
            if (ves>0.5 || ves<1){
                var price = price*0.53
                println("sebest: $price")
            }else if (ves>1 || ves<5){
                var price = price*0.45
                println("sebest: $price")
            }else if (ves>5){
                var price = price*0.38
                println("sebest: $price")
            }
        return price
    }
}