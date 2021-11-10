fun main() {
    val n = readLine()!!.toInt()

    repeat(n) {
        val num = readLine()!!.toInt()
        val min = num
        if (num > n) {
            return true
        }
    } print()
}