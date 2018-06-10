import java.util.*


fun factorial(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        n + factorial(n - 1)
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = factorial(n)

    println(result)
}
