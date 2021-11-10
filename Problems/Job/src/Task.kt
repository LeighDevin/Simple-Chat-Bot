fun main() {
    var age = readLine()!!.toInt()
    val range = 18..59
    val within = age in range

    println(within)
}