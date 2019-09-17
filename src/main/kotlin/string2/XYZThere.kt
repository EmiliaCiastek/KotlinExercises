package string2

/**
 * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
 *
 * Examples:
 * xyzThere("abcxyz") → true
 * xyzThere("abc.xyz") → false
 * xyzThere("xyz.abc") → true
 */

fun xyzThere(str: String): Boolean {

    var xyz: String
    var counter: Int = 0

    for (element in str) {

        if (element == "x") {

            xyz = element.substring(counter, counter + 3)

            if (xyz == "xyz" /* && element[counter - 1] == "." || counter - 1 < 0 */) {

                return false

            }

            else {

                return true

            }

        }

        counter = counter + 1

    }

}
