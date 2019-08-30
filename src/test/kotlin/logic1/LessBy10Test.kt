package logic1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LessBy10Test {

    @ParameterizedTest
    @CsvSource(value = [
    "1, 7, 10",
    "10, 7, 1",
    "2, 11, 11",
    "3, 3, 3",
    "10, 11, 2"
    ])
    fun shouldReturnFalse(a: Int, b: Int, c: Int) {
        assertThat(lessBy10(a, b, c)).isFalse()
    }

    @ParameterizedTest
    @CsvSource(value = [
        "1, 7, 11",
        "11, 7, 1",
        "-10, 2, 2",
        "3, 3, 30",
        "10, 1, 11",
        "10, 11, 1",
        "3, 30, 3",
        "2, 2, -8",
        "2, 8, 12"
    ])
    fun shouldReturnTrue(a: Int, b: Int, c: Int) {
        assertThat(lessBy10(a, b, c)).isTrue()
    }
}
