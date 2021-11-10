fun main() {
    var A = readLine()!!.toInt()

    if (A > -15 && A <= 12 || A > 14 && A < 17 || A >= 19) {
        println("True")
    } else {
        println("False")
    }
}