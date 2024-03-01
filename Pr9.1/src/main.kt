fun main(){
    try{
        println("milki or kisloe")
        val vib = readLine()!!.toInt()
        if (vib == 1)
        {
            val product = Milkprod("",0.0,"",0.0,0.0)
            product.Outpe()
            product.GetInfo(product.type,product.ves,product.proizv,product.price,product.gir)
            product.srok(product.type)
            val r = Proizvodstvo("",0.0,"",0.0,0.0)
            r.Sebest(product.price)
        }
        else if (vib == 2){
            val product = Kislomolochnoe("",0.0,"",0.0,0.0,"кислое")
            product.Outpe()
            product.GetInfo(product.type,product.ves,product.proizv,product.price,product.gir)
            product.srok(product.type)
            val r = Proizvodstvo("",0.0,"",0.0,0.0)
            r.Sebest(product.price)
        } else
        {
            println("Выберите один из типов продукта, впишите один ии два")
        }
    }catch (e:Exception){
        println("repete, please")
    }
}