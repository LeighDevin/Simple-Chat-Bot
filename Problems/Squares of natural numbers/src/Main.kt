fun main() {
    val n = readLine()!!.toInt()
    var natNum = 1

    while (natNum <= n) {
        var natNum2 = natNum * natNum
        if (natNum2 <= n) {
            println(natNum2)
        }

        natNum += 1
    }
}