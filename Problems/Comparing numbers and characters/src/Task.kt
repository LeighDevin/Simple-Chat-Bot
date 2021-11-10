fun main() {
    val num1: Int = readLine()!!.toInt()
    val char1: Char = readLine()!!.first()
    val char2: Int = char1.code
    println(num1 == char2)
}