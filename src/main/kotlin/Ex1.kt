
/**
 * Warmup-1 - startHi
 * Given a string, return true if the string starts with "hi" and false otherwise.
 *
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 **/

fun startHi(str: String): Boolean {

    if(str.isEmpty())
    {
        return false
    }
    else if(str.length < 2)
    {
        return false
    }
    else if(str.substring(0,2) == "hi")
    {
        return true
    }
    else
    {
        return false
    }

}