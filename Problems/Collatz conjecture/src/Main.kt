fun main() {
    var n = readLine()!!.toInt()

    print("$n ")

    while (n > 1) {
        if (n == 1) {
            print("$n ")
            break
        } else if (n % 2 == 0) {
            n /= 2
            print("$n ")
        } else if (n % 2 == 1) {
            n = n * 3 + 1
            print("$n ")
        }
    }

}