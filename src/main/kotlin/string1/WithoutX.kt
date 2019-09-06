package string1

/**
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged.
 *
 * Examples:
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */

fun withoutX(str: String): String {

    if (str.isEmpty()){

        return str

    }

    if (str == "x"){

        return ""

    }

    if (str.substring(0,1) == "x" && str.substring(str.length - 1, str.length) == "x"){

        return str.substring(1,str.length - 1)

    }
    else if (str.substring(str.length - 1, str.length) == "x"){

        return str.substring(0, str.length - 1)

    }
    else if (str.substring(0,1) == "x"){

        return str.substring(1,str.length)

    }
    else{

        return str

    }

}