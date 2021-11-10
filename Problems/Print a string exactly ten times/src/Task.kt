fun main() {
    // program to repeat a code of line n times
    val n: Int = 10
    val line: String = readLine()!!

    repeat(n) {
        println(line)
    }
}