fun main() {
    val n = readLine()!!.toInt()
    var sumD = 0
    var sumC = 0
    var sumB = 0
    var sumA = 0

    repeat(n) {
        var next = readLine()!!.toInt()

        if(next == 5) {
            sumA += 1
        } else if (next == 4) {
            sumB += 1
        } else if (next == 3) {
            sumC += 1
        } else if (next == 2) {
            sumD += 1
        }
    }

    print("$sumD $sumC $sumB $sumA")
}