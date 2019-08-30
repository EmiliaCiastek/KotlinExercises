package string1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class FirstHalfTest {

    @Test
    fun shouldReturnEmptyStringForEmptyInput() {
        assertThat(firstHalf("")).isEqualTo("")
    }

    @ParameterizedTest
    @CsvSource(value = [
        "WooHoo, Woo",
        "HelloThere, Hello",
        "abcdef, abc",
        "ab, a",
        "0123456789 ,01234",
        "kitten, kit"
    ])
    fun shouldReturnFirstHalfOfTheString(str: String, expected: String) {
        assertThat(firstHalf(str)).isEqualTo(expected)
    }
}
