package string2

/** Return the number of times that the string "hi" appears anywhere in the given string.
 *
 * Examples:
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */

fun countHi(str: String): Int {

    var index: Int = 0
    var counter: Int = 0

        for(i in str){

            if(i == 'h' && index + 2 <= str.length){

                if(str.substring(index, index + 2) == "hi"){

                    counter++

                }

            }

            index++

        }

    return counter

}
