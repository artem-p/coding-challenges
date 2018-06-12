package main.java.array

import java.util.*


/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 * */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ARRAY_SIZE = 6

    val inputArr = Array<Array<Int>>(ARRAY_SIZE, { Array<Int>(ARRAY_SIZE, { 0 }) })

    for (i in 0 until 6) {
        inputArr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    var hourglassSumMax = Int.MIN_VALUE

    for (i in 0..ARRAY_SIZE) {
        for (j in 0..ARRAY_SIZE) {
            if (i + 2 >= ARRAY_SIZE || j + 2 >= ARRAY_SIZE) continue



            val hourglassSum = inputArr[i][j] + inputArr[i][j + 1] + inputArr[i][j + 2] +
                    inputArr[i + 1][j + 1] + inputArr[i + 2][j] + inputArr[i + 2][j + 1] + inputArr[i + 2][j + 2]

            if (hourglassSum > hourglassSumMax) {
                hourglassSumMax = hourglassSum
            }
        }
    }


    println(hourglassSumMax)
}

