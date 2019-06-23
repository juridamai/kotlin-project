import java.util.*

fun main(args:Array<String>){
    print("Masukan tahun lahir anda : ")
    var tahunLahir:Int = readLine()!!.toInt()

    var tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)
    var umur:Int = tahunSekarang - tahunLahir

    println("Umur anda = "+umur)

}