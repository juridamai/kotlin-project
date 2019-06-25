fun main(args:Array<String>){
    var arrayList = ArrayList<String>()

    arrayList.add("Test1")
    arrayList.add("Test2")
    arrayList.add("Test3")
    arrayList.add("Test4")
    arrayList.add("Test5")

    println("Hasil cetak tulisan "+arrayList.get(2))

    arrayList.set(2,"Kristian")

    println("Hasil cetak tulisan "+arrayList.get(2))


    for (item in arrayList){
        println(item)
    }
}