package logic1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class GreenTicketTest {

    @ParameterizedTest
    @CsvSource(
        value = [
            "1, 2, 3, 0",
            "2, 2, 2, 20",
            "1, 1, 2, 10",
            "2, 1, 1, 10",
            "1, 2, 1, 10",
            "3, 2, 1, 0",
            "0, 0, 0, 20",
            "2, 0, 0, 10",
            "0, 9, 10, 0",
            "0, 10, 0, 10",
            "9, 9, 9, 20",
            "9, 0, 9, 10"
        ]
    )
    fun shouldReturnCorrectResult(a: Int, b: Int, c: Int, expected: Int) {
        assertThat(greenTicket(a, b, c)).isEqualTo(expected)
    }
}
