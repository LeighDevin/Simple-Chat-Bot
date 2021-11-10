fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val range1 = num1..num2
    val num3 = readLine()!!.toInt()
    val num4 = readLine()!!.toInt()
    val range2 = num3..num4
    val num5 = readLine()!!.toInt()

    if (num5 in range1 && num5 in range2) {
        print("true")
    } else {
        print("false")
    }
}