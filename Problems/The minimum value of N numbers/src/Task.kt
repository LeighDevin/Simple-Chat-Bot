fun main() {
    val num = readLine()!!.toInt()
    var min = 10000

    repeat (num) {
        val b = readLine()!!.toInt()
        if (b < min) {
            min = b
        }
    }
    println(min)
}