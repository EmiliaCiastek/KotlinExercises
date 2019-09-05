package array1

/**
 * Given an array of ints length 3, return the sum of all the elements.
 *
 * Examples:
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */

fun sum3(nums: Array<Int>): Int {

    var sum = 0

    for (element in nums){

        sum = sum + element

    }

    return sum

}
