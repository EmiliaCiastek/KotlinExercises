package string1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class MakeOutWordTest {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    fun shouldReturnFormattedString(out: String, word: String, expected: String) {
        assertThat(makeOutWord(out, word)).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun argumentsProvider() =
            listOf(
                Arguments.arguments("<<>>", "Yay", "<<Yay>>"),
                Arguments.arguments("<<>>", "WooHoo", "<<WooHoo>>"),
                Arguments.arguments("[[]]", "word", "[[word]]"),
                Arguments.arguments("HHoo", "Hello", "HHHellooo"),
                Arguments.arguments("abyz", "YAY", "abYAYyz"),
                Arguments.arguments("<<>>", "", "<<>>")
            )
    }
}
