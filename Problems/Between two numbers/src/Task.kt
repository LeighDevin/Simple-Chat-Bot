fun main() {
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()
    var range1 = num2..num3

    if (num1 in range1) {
        print("true")
    } else {
        print("false")
    }
}