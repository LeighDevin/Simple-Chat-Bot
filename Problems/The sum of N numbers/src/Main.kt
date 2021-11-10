fun main() {
    val a = readLine()!!.toInt()
    var num = 0

    for (i in 1..a) {
        val b = readLine()!!.toInt()
        num += b
    }
    print(num)
}