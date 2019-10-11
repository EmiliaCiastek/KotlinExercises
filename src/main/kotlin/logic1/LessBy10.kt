package logic1

/**
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 *
 * Examples:
 * lessBy10(1, 7, 11) → true
 * lessBy10(1, 7, 10) → false
 * lessBy10(11, 1, 7) → true
 */

fun lessBy10(a: Int, b: Int, c: Int): Boolean {

    var array = intArrayOf(a,b,c)

    array.sort()

    return array[2] - array[1] >= 10 || array[1] - array[0] >= 10 || array[2] - array[0] >= 10

}
