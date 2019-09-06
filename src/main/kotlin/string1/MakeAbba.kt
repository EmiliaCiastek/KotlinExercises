package string1

/**
 * Given two strings, a and b, return the result of putting them together in the order abba,
 * e.g. "Hi" and "Bye" returns "HiByeByeHi".
 *
 * Examples:
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */

fun makeAbba(a: String, b: String): String {

    return "$a$b$b$a"

}
