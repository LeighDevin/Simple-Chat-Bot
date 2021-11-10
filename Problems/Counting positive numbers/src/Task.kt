fun main() {
    val n = readLine()!!.toInt()
    var posNum = 0

    repeat(n) {
        var next = readLine()!!.toInt()

        if (next > 0) {
            posNum += 1
        }
    }

    print(posNum)
}