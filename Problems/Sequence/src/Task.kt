fun main() {
    val char1: Char = readLine()!!.first()
    val char2: Char = readLine()!!.first()
    val char3: Char = readLine()!!.first()
    val order = (char1 < char2) && (char2 < char3)
    val order2 = (char2 == char1 + 1) && (char3 == char2 + 1)
    val order3 = order && order2

    print(order3)
}