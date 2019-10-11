package string2

/**
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 * Examples:
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */

fun catDog(str: String): Boolean {

    var counter: Int = 0
    var counterCat: Int = 0
    var counterDog: Int = 0

    for(i in str){

        if(i == 'c' && counter + 3 <= str.length){

            if(str.substring(counter, counter + 3) == "cat"){

                counterCat++

            }

        }

        if(i == 'd' && counter + 3 <= str.length){

            if(str.substring(counter, counter + 3) == "dog"){

                counterDog++

            }

        }

        counter++

    }


    return counterCat == counterDog


}
