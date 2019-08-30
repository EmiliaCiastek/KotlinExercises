package array1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class CommonEndTest {

    @ParameterizedTest
    @MethodSource("falseProvider")
    fun shouldReturnFalse(a: Array<Int>, b: Array<Int>) {
        assertThat(commonEnd(a, b)).isFalse()
    }

    @ParameterizedTest
    @MethodSource("trueProvider")
    fun shouldReturnTrue(a: Array<Int>, b: Array<Int>) {
        assertThat(commonEnd(a, b)).isTrue()
    }

    companion object {

        @JvmStatic
        fun falseProvider() =
            listOf(
                arguments(arrayOf(1, 2, 3), arrayOf(7, 3, 2)),
                arguments(arrayOf(1, 2, 3), arrayOf(2))
            )

        @JvmStatic
        fun trueProvider() =
            listOf(
                arguments(arrayOf(1, 2, 3), arrayOf(7, 3)),
                arguments(arrayOf(1, 2, 3), arrayOf(1, 3)),
                arguments(arrayOf(1, 2 ,3), arrayOf(1))
            )
    }
}