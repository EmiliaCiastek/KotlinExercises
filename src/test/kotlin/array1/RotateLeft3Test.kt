package array1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class RotateLeft3Test {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun shouldRotateArray(nums: Array<Int>, expected: Array<Int>) {
        assertThat(rotateLeft3(nums)).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun dataProvider() =
            listOf(
                arguments(arrayOf(1, 2, 3), arrayOf(2, 3, 1)),
                arguments(arrayOf(5, 11, 9), arrayOf(11, 9, 5)),
                arguments(arrayOf(7, 0, 0), arrayOf(0, 0, 7)),
                arguments(arrayOf(1, 2, 1), arrayOf(2, 1, 1)),
                arguments(arrayOf(0, 0, 1), arrayOf(0, 1, 0))
            )
    }
}
