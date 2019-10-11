package string2

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * Examples:
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */

fun doubleChar(str: String): String {

    var word: String = ""

    for (element in str){

        word+= "$element$element"

    }

    return word

}
