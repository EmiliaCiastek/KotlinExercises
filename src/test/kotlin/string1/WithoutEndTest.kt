package string1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class WithoutEndTest {

    @Test
    fun shouldReturnEmptyString() {
        assertThat(withoutEnd("ab")).isEqualTo("")
    }

    @ParameterizedTest
    @CsvSource(value = [
        "Hello, ell",
        "java, av",
        "coding, odin",
        "code, od",
        "Chocolate! ,hocolate",
        "kitten, itte"
    ])
    fun shouldReturnStringWithoutFirstAndLastChar(str: String, expected: String) {
        assertThat(withoutEnd(str)).isEqualTo(expected)
    }
}
