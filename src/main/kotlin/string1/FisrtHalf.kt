package string1

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 *
 * Examples:
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */

fun firstHalf(str: String): String {

    if (str.isEmpty()){

        return str

    }
    else {

        return str.substring(0, str.length / 2)

    }

}
