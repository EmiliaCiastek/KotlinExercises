package array1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class Sum3 {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun shouldCalculateSum(nums: Array<Int>, expected: Int) {
        assertThat(sum3(nums)).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun dataProvider() =
            listOf(
                arguments(arrayOf(1, 2, 3), 6),
                arguments(arrayOf(5, 11, 2), 18),
                arguments(arrayOf(7, 0, 0), 7),
                arguments(arrayOf(1, 2, 1), 4),
                arguments(arrayOf(2, 7, 2), 11)
            )
    }
}
