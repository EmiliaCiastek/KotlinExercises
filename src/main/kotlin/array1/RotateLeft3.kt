package array1

/**
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 *
 * Examples:
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

fun rotateLeft3(nums: Array<Int>): Array<Int> {

    var index_array: Int = 0

    for (i in 1..nums.size - 1){

        var zapisz = nums[index_array]
        nums[index_array] = nums[index_array + 1]
        nums[index_array + 1] = zapisz
        index_array = index_array + 1

    }

    return nums

}
