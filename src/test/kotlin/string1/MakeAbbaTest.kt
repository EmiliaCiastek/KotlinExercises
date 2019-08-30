package string1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class MakeAbbaTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun shouldMakeAbbaString(a: String, b: String, expected: String) {
        assertThat(makeAbba(a, b)).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun argumentsProvider() =
            listOf(
                Arguments.arguments("Hi", "Bye", "HiByeByeHi"),
                Arguments.arguments("Yo", "Alice", "YoAliceAliceYo"),
                Arguments.arguments("What", "Up", "WhatUpUpWhat"),
                Arguments.arguments("aaa", "bbb", "aaabbbbbbaaa"),
                Arguments.arguments("x", "y", "xyyx"),
                Arguments.arguments("x", "", "xx"),
                Arguments.arguments("", "y", "yy"),
                Arguments.arguments("Ya", "Ya", "YaYaYaYa")
            )
    }
}