import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

class Ex4Test {

    @ParameterizedTest
    @MethodSource("falseProvider")
    fun shouldReturnFalse(array: Array<Int>) {
        assertThat(firstLast6(array)).isFalse()
    }

    @ParameterizedTest
    @MethodSource("trueProvider")
    fun shouldReturnTrue(array: Array<Int>) {
        assertThat(firstLast6(array)).isTrue()
    }

    companion object {

        @JvmStatic
        fun falseProvider() =
            listOf(
                arguments(arrayOf(13, 6, 1, 2, 3)),
                arguments(arrayOf(3, 2, 1)),
                arguments(arrayOf(3, 6, 1)),
                arguments(arrayOf(3)),
                arguments(arrayOf(5, 5)),
                arguments(arrayOf(1, 2, 3, 4))
            )

        @JvmStatic
        fun trueProvider() =
            listOf(
                arguments(arrayOf(1, 2, 6)),
                arguments(arrayOf(6, 1, 2, 3)),
                arguments(arrayOf(13, 6, 1, 2, 6)),
                arguments(arrayOf(3, 6)),
                arguments(arrayOf(6)),
                arguments(arrayOf(5, 6)),
                arguments(arrayOf(1, 2, 3, 4, 6))
            )
    }
}
