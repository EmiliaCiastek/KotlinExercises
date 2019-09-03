package string2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class DoubleCharTest {

    @Test
    fun shouldReturnEmptyString() {
        assertThat(doubleChar("")).isEqualTo("")
    }

    @ParameterizedTest
    @CsvSource(value = [
        "The, TThhee",
        "AAbb, AAAAbbbb",
        "Hi-There, HHii--TThheerree",
        "Word!, WWoorrdd!!",
        "!! ,!!!!",
        "a, aa",
        "., ..",
        "aa, aaaa "
    ])
    fun shouldReturnStringWithDoubledChars(str: String, expected: String) {
        assertThat(doubleChar(str)).isEqualTo(expected)
    }
}
