fun main(args: Array<String>) {
    print("Masukan angka 0 - 10 : ")
    var angka: Int = readLine()!!.toInt();
    var cetak: String = if (angka > 10) "Anda memasukan agka diatas 10"
    else "Anda memasukan angka dibawa 10"

    print("masukan nilai 0 - 100")
    var nilai: Double = readLine()!!.toDouble()
    var grade: String?

    when (nilai) {
        in 90..100 -> {
            grade = "A";
        }
        else -> {
            grade = "Bukan A";
        }
    }

    print(grade)
}