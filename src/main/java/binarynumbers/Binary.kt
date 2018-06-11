package main.java.binarynumbers

import java.util.*


/***
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * Convert decimal to binary and compute maximum number of consecutive 1's.
 */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    var number = scan.nextLine().trim().toInt()

    var currentOnesConsecutiveNumber = 0
    var maxOnesConsecutiveNumber = 0

    while (number > 0) {
        val remainder = number % 2
        number /= 2

        if (remainder == 1) {
            currentOnesConsecutiveNumber++
        } else {

            maxOnesConsecutiveNumber = saveMaxOnesConsecutiveNumber(currentOnesConsecutiveNumber, maxOnesConsecutiveNumber)

            currentOnesConsecutiveNumber = 0
        }
    }

    maxOnesConsecutiveNumber = saveMaxOnesConsecutiveNumber(currentOnesConsecutiveNumber, maxOnesConsecutiveNumber)

    println(maxOnesConsecutiveNumber)
}


fun saveMaxOnesConsecutiveNumber(currentOnesConsecutiveNumber: Int, maxOnesConsecutiveNumber: Int): Int {
    var output = maxOnesConsecutiveNumber
    if (currentOnesConsecutiveNumber > maxOnesConsecutiveNumber) {
        output = currentOnesConsecutiveNumber
    }

    return output
}