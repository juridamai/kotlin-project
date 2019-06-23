fun main(args:Array<String>){
    var nilai = 3

//    when(nilai){
//        1-> {
//            println("Anda memilih option 1")
//        }
//        2-> {
//            println("Anda memilih option 2")
//        }
//        3-> {
//            println("Anda memilih option 3")
//        }
//        4-> {
//            println("Anda memilih option 4")
//        }
//        else ->{
//            println("Tidak ada option")
//        }
//    }

    when(nilai){
        1,2,3-> println("Anda memilih option 1")
        in 10..20-> println("Anda memilih option 2") //in diatara
        !in 20..30-> println("Anda memilih option 3")
        else ->println("Tidak ada option")
    }
}