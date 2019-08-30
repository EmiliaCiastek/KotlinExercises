package array1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SameFirstLastTest {

    @ParameterizedTest
    @MethodSource("falseProvider")
    fun shouldReturnFalse(nums: Array<Int>) {
        assertThat(sameFirstLast(nums)).isFalse()
    }

    @ParameterizedTest
    @MethodSource("trueProvider")
    fun shouldReturnTrue(nums: Array<Int>) {
        assertThat(sameFirstLast(nums)).isTrue()
    }

    companion object {

        @JvmStatic
        fun falseProvider() =
            listOf(
                Arguments.arguments(arrayOf(1, 2, 3)),
                Arguments.arguments(emptyArray<Int>()),
                Arguments.arguments(arrayOf(1, 2, 3, 4, 5, 13))
            )

        @JvmStatic
        fun trueProvider() =
            listOf(
                Arguments.arguments(arrayOf(1, 2, 3, 1)),
                Arguments.arguments(arrayOf(1, 2, 1)),
                Arguments.arguments(arrayOf(7)),
                Arguments.arguments(arrayOf(1, 2, 3, 4, 5, 1)),
                Arguments.arguments(arrayOf(13, 2, 3, 4, 5, 13)),
                Arguments.arguments(arrayOf(7, 7))
            )
    }
}