fun main() {
    val n = readLine()!!.toInt()
    var sumPerfect = 0
    var sumSmaller = 0
    var sumLarger = 0

    repeat(n) {
        val next = readLine()!!.toInt()
        if (next > 0) {
            sumLarger += 1
        } else if (next == 0) {
            sumPerfect += 1
        } else {
            sumSmaller += 1
        }
    }

    print("$sumPerfect $sumLarger $sumSmaller")
}