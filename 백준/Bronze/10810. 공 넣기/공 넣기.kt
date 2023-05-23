import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val basketCount = scanner.nextInt()
    val num = scanner.nextInt()

    val array = Array(basketCount) { 0 }
    
    for (tryInput in 1..num) {
        val start = scanner.nextInt()
        val end = scanner.nextInt()
        val ballNum = scanner.nextInt()

        for (j in start-1 until end) {
            array[j] = ballNum
        }

    }
    for (element in array) {
        print("$element ")
    }
}
