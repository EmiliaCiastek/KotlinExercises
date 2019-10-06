package string2

/** Return the number of times that the string "hi" appears anywhere in the given string.
 *
 * Examples:
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */

fun countHi(str: String): Int {

    var counter: Int = 0
    var timer: Int = 0

        for(i in str){

            if(i == 'h' && counter + 2 <= str.length){

                if(str.substring(counter, counter + 2) == "hi"){

                    timer = timer + 1

                }

            }

            counter = counter + 1

        }

    return timer

}
