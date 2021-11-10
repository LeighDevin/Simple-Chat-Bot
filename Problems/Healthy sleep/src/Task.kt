fun main() {    
    var A = readLine()!!.toInt()
    var B = readLine()!!.toInt()
    var H = readLine()!!.toInt()

    if (H < A) {
        println("Deficiency")
    } else if (H in A..B) {
        println("Normal")
    } else if (H > B) {
        println("Excess")
    }
}