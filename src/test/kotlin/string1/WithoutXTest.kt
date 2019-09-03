package string1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class WithoutXTest {

    @ParameterizedTest
    @ValueSource(strings = ["xx", "x", ""])
    fun shouldReturnEmptyString(str: String) {
        assertThat(withoutX(str)).isEqualTo("")
    }

    @ParameterizedTest
    @CsvSource(value = [
        "xHix, Hi",
        "xHi, Hi",
        "Hxix, Hxi",
        "Hi, Hi",
        "xxHi ,xHi",
        "Hix, Hi",
        "xaxbx, axb",
        "Hexllo,Hexllo "
    ])
    fun shouldReturnStringWithoutX(str: String, expected: String) {
        assertThat(withoutX(str)).isEqualTo(expected)
    }
}
