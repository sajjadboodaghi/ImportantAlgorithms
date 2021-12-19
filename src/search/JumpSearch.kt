package search

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

class JumpSearch(private val list: List<Int>) {

    fun find(findingNumber: Int): Int {
        val n: Int = list.size
        val jumpStep: Int = floor(sqrt(n.toDouble())).toInt()
        var a: Int = 0
        var b: Int = jumpStep
        while (list[min(b, n) - 1] < findingNumber) {
            a = b
            b += jumpStep
            if (a >= n) {
                return -1
            }
        }

        while (list[a] < findingNumber) {
            a += 1
            if (a == min(b, n)) {
                return -1
            }
        }

        return if (list[a] == findingNumber) a else -1

    }
}

fun min(a: Int, b: Int) = if (a < b) a else b


fun main() {

    val list = listOf(2, 3, 4, 5, 6, 12, 21, 34, 48, 59, 64, 95, 112)
    val numbersToFind = listOf(-1, 0, 2, 6, 33, 112, 113, 201)
    checkNumbers(list, numbersToFind)
}

fun checkNumbers(list: List<Int>, numbers: List<Int>) {
    numbers.forEach {
        number ->
        println("Input: $number")
        println("Result: ${JumpSearch(list).find(number)}")
        println()
    }
}