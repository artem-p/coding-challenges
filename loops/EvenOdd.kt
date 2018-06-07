package loops

import java.util.*

/**
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 * */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val caseNumber = scan.nextLine().trim().toInt()

    for (caseCount in 1..caseNumber) {
        var evens = ""
        var odds = ""

        val inputText = scan.nextLine().toString()

        var index = 0
        for (symbol in inputText.toCharArray().iterator()) {
            if (index % 2 == 0) {
                evens += symbol
            } else {
                odds += symbol
            }

            index++
        }

        println("$evens $odds")
    }
}