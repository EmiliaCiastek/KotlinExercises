package array1

/**
 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 *
 * Examples:
 * sameFirstLast([1, 2, 3]) → false
 * sameFirstLast([1, 2, 3, 1]) → true
 * sameFirstLast([1, 2, 1]) → true
 */

fun sameFirstLast(nums: Array<Int>): Boolean {

    if(nums.size == 0){

        return false

    }else {

        if (nums[0] == nums[nums.size - 1]) {

            return true

        } else {

            return false

        }
    }

}
