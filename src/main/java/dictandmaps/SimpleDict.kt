package main.java.dictandmaps

import java.util.*


/**
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 * */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val addressBook = hashMapOf<String, String>()

    val number = scan.nextLine().trim().toInt()

    for (count in 1..number) {

        val inputPhoneAndName = scan.nextLine().split(" ")
        val name = inputPhoneAndName[0]
        val phone = inputPhoneAndName[1]

        addressBook[name] = phone
    }


    while (true) {
        val name = scan.nextLine()

        if (name in addressBook) {
            println("$name=${addressBook[name]}")
        } else {
            println("Not found")
        }
    }
}