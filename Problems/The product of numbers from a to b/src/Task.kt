fun main() {
    val num = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    var prod: Long = 1

    for (i in num until num2) {
        prod *= i
    }

    print(prod)
}