import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class Ex2Test {

    @Test
    fun shouldReturnZero() {
        assertThat(max1020(9, 21)).isEqualTo(0)
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun shouldReturnLargerValueInRange(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(max1020(firstValue, secondValue)).isEqualTo(result)
    }

    companion object {

        @JvmStatic
        fun argumentsProvider() =
            listOf(
                arguments(11, 19, 19),
                arguments(19, 11, 19),
                arguments(11, 9, 11),
                arguments(10, 21, 10),
                arguments(21, 10, 10),
                arguments(9, 11, 11),
                arguments(20, 10, 20),
                arguments(23, 10, 10),
                arguments(7, 20, 20),
                arguments(17, 16, 17)
            )
    }
}
