fun main(args:Array<String>){
    var arrayInt = Array<Int>(5){0}

    arrayInt[2] = 33
    arrayInt[4] = 23

    println("Index 2 "+arrayInt[2])
    println("Index 4 "+arrayInt[4])


    for (element in arrayInt){
        println(element)
    }
}