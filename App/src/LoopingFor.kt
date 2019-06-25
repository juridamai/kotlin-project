fun main(args:Array<String>){
    for(i in 1..10){
//        println("Test : $i")
//        println("Test : "+i)
        if(i == 5){
            println("5")
        }
    }


    for(ulang in 1..5){
        println("Jumlah perulangan 1 : $ulang")

        for (ulang2 in 1..3){
            println("Jumlah perulangan 2 : $ulang2")
        }
    }

    println("Perulangan selesai")
}