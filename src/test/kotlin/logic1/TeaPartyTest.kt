package logic1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TeaPartyTest {

    @ParameterizedTest
    @CsvSource(
        value = [
            "6, 8, 1",
            "3, 8, 0",
            "20, 6, 2",
            "12, 6, 2",
            "11, 6, 1",
            "11, 4, 0",
            "4, 5, 0",
            "5, 5, 1",
            "6, 6, 1",
            "5, 10, 2",
            "5, 9, 1",
            "10, 4, 0",
            "10, 20, 2"
        ]
    )
    fun shouldReturnCorrectValues(tea: Int, candy: Int, expected: Int) {
        assertThat(teaParty(tea, candy)).isEqualTo(expected)
    }
}