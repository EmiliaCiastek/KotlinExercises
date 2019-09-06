package logic1

/**
 * You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
 * the result is 0. If all of the numbers are the same, the result is 20.
 * If two of the numbers are the same, the result is 10.
 *
 * Examples:
 * greenTicket(1, 2, 3) → 0
 * greenTicket(2, 2, 2) → 20
 * greenTicket(1, 1, 2) → 10
 */

fun greenTicket(a: Int, b: Int, c: Int): Int {

//    if (a != b && b != c && a != c){
//
//        return 0
//
//    } else if (a == b && b == c){
//
//        return 20
//
//    } else if (a == b || a == c || b == c){
//
//        return 10
//
//    }
//    else{
//
//        return 0
//
//    }

    when {
        a != b && b != c && a != c -> return 0
        a == b && b == c -> return 20
        a == b || a == c || b == c -> return 10
        else -> return -1
    }

}