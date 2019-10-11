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

//    var indexArray: Int = 0
//
//    for (i in 1..nums.size - 1){
//
//        val tmp = nums[indexArray]
//        nums[indexArray] = nums[indexArray + 1]
//        nums[indexArray + 1] = tmp
//        indexArray += 1
//
//    }
//
//    return nums


    return arrayOf(nums[1],nums[2], nums[0])


}
