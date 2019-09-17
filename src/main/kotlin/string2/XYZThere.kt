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

        if (element == 'x') {

            xyz = str.substring(counter, counter + 3)

            if (counter != 0) {

                if (xyz == "xyz" && str[counter - 1] == '.') {

                    return false

                } else {

                    return true

                }

            }

            else{

                if (xyz == "xyz") {

                    return true

                }

            }
        }

        counter = counter + 1

    }

    return false

}
