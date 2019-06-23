fun main(args:Array<String>){
    print("Masukan nilai angka : ")
    var angka:Int = readLine()!!.toInt()

    if(angka>90){
        println("Nilai huruf : A")
        if(angka>98){
            println("Sempurna");
        }else{
            println("GPP")
        }
    }else if(angka>80){
        println("Nilai huruf : B")
    }else{
        println("Nilai huruf : C")
    }


}