package string2

/**
 * Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string
 * appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
 *
 * Examples:
 * prefixAgain("abXYabc", 1) → true
 * prefixAgain("abXYabc", 2) → true
 * prefixAgain("abXYabc", 3) → false
 */

fun prefixAgain(str: String, n: Int): Boolean {

    // do poprawyy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    var counter: Int = 0

        for (element in str){

            if (element == str[n - 1]){

                counter++

            }

        }

    return counter >=2

}
