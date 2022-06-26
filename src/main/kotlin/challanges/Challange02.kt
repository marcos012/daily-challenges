package challanges

/**
 * Given an array of integers, find the first missing positive integer in
 * linear time and constant space. In other words, find the lowest positive
 * integer that does not exist in the array. The array can contain
 * duplicates and negative numbers as well.
 * */
class Challange03 {
    fun checkLowestPositive(list: List<Int>): Int {
         var minValue = list.minOf { min -> if (min > 0) min else 1 }

        while (list.contains(minValue)) {
            minValue += 1
        }

        return minValue
    }
}