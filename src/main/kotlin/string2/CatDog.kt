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
    var timer_cat: Int = 0
    var timer_dog: Int = 0

    for(i in str){

        if(i == 'c' && counter + 3 <= str.length){

            if(str.substring(counter, counter + 3) == "cat"){

                timer_cat = timer_cat + 1

            }

        }

        counter = counter + 1

    }


         counter = 0


    for(i in str){

        if(i == 'd' && counter + 3 <= str.length){

            if(str.substring(counter, counter + 3) == "dog"){

                timer_dog = timer_dog + 1

            }

        }

        counter = counter + 1

    }


    if(timer_cat == timer_dog){

        return true

    }
    else{

        return false

    }


}
