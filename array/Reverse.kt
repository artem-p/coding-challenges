import java.util.*

/**
 * https://www.hackerrank.com/challenges/30-arrays/problem
 * */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val number = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    arr.reverse()

    for (element in arr) {
        print(element.toString() + " ")
    }
}