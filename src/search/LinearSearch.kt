package search
class LinearSearch {
    companion object {
        fun <T> find(list: ArrayList<T>, subject: T) : Int {
            for(i in list.indices)
                if(list[i] == subject)
                    return i
            return -1
        }

        fun <T> find(array: Array<T>, subject: T): Int {
            for(i in 0 until array.size)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun <T> find(list: List<T>, subject: T): Int {
            for(i in list.indices)
                if(list[i] == subject)
                    return i
            return -1
        }

        fun find(array: IntArray, subject: Int): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: ShortArray, subject: Short): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: ByteArray, subject: Byte): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: DoubleArray, subject: Double): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: FloatArray, subject: Float): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: LongArray, subject: Long): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

        fun find(array: CharArray, subject: Char): Int {
            for(i in array.indices)
                if(array[i] == subject)
                    return i
            return -1
        }

    }

}

fun main() {

    val arr: ShortArray = shortArrayOf(2, 3, 4, 10, 40)
    val x: Short = 100

    val result = LinearSearch.find(arr, x)
    if (result == -1) {
        println("Element is not present in array")
    } else {
        println("Element is present at index $result")
    }

}