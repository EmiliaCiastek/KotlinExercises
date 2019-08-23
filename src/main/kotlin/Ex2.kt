/**
 * Warmup-1 - max1020
 *
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

fun max1020(a: Int, b: Int): Int {

    /* if(a in 10..20 && b in 10..20) {

       if (a < b) {
           return b
       } else if (a > b) {
           return b
       }
   }
    else
   {
       return 0
   }
*/


    if (a >= 10 && a <= 20 && b >= 10 && b <= 20)
    {
        if (a > b)
        {
            return a
        }
        else if (b > a)
        {
            return b
        }
        else if(a == b)
        {
            return a
        }
    }
    else if (a >= 10 && a <= 20)
    {
        return a
    }
    else if (b >= 10 && b <= 20)
    {
        return b
    }

    return 0

}

