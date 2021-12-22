package search

import kotlin.math.floor

class BinarySearch(private val list: List<Int>) {
    fun find(subject: Int): Int {
        var left: Int = 0
        var right: Int = list.size
        var k: Int = 0
        do {
            k = (left + right) / 2

            if(list[k] > subject) {
                right = k
            }

            if(list[k] < subject) {
                left = k + 1
            }

            if(list[k] == subject) return k
        } while(left < right)

        return -1
    }
}

fun binarySearchRecursive(list: List<Int>, subject: Int, low: Int, high: Int): Int {
    if(low >= high) return -1
    val mid = low + ((high - low) / 2)
    return if(list[mid] > subject)
        binarySearchRecursive(list, subject, low, mid)
    else if(list[mid] < subject)
        binarySearchRecursive(list, subject, mid + 1, high)
    else mid
}

fun main() {
//    val list = listOf(2, 3, 4, 5, 6, 12, 21, 34, 48, 59, 64, 95, 112)

    val list = listOf(910, 1000, 1230, 1400, 1500, 1600, 3450, 4544)

//    val list = listOf(1, 4, 6, 7)

    val numbersToFind = listOf(-1, 0, 2, 4, 5, 6, 33, 112, 113, 201)



    (numbersToFind + list).forEach { number ->
        println("Input: $number")
        println("Result: ${BinarySearch(list).find(number)}")
        println()
    }

//    (numbersToFind + list).forEach { number ->
//        println("Input: $number")
//        println("Result: ${binarySearchRecursive(list, number, 0, list.size)}")
//        println()
//    }
}
