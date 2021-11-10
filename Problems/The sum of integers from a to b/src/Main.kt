fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var num = 0

    for (i in a..b) {
        num += i
    }
    print(num)
}