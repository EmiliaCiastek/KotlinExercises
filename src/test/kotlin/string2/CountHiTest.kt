package string2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CountHiTest {

    @Test
    fun shouldReturn0ForEmptyString() {
        assertThat(countHi("")).isEqualTo(0)
    }

    @ParameterizedTest
    @CsvSource(value = [
        "abc hi ho, 1",
        "ABChi hi, 2",
        "hihi, 2",
        "hiHIhi, 2",
        "h ,0",
        "hi, 1",
        "Hi is no HI on ahI, 0",
        "hiho not HOHIhi, 2 "
    ])
    fun shouldReturnNumberOfHi(str: String, count: Int) {
        assertThat(countHi(str)).isEqualTo(count)
    }
}
