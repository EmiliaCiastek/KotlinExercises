package array1

/**
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
 *
 * Examples:
 * commonEnd([1, 2, 3], [7, 3]) → true
 * commonEnd([1, 2, 3], [7, 3, 2]) → false
 * commonEnd([1, 2, 3], [1, 3]) → true
 */

fun commonEnd(a: Array<Int>, b: Array<Int>): Boolean {

    return a[0] == b[0] || a[a.size - 1] == b[b.size - 1]

}
