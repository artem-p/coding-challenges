package loops

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val base = scan.nextLine().trim().toInt()

    for (counter in 1..10) {
        val product = base * counter
        println("$base x $counter = $product")
    }
}
