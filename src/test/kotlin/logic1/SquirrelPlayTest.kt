package logic1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SquirrelPlayTest {

    @ParameterizedTest
    @CsvSource(
        value = [
            "95, false",
            "50, false",
            "50, true",
            "100, false",
            "105, true",
            "59, false",
            "59, true"
        ]
    )
    fun shouldReturnFalse(temp: Int, isSummer: Boolean) {
        assertThat(squirrelPlay(temp, isSummer)).isFalse()
    }

    @ParameterizedTest
    @CsvSource(
        value = [
            "70, false",
            "95, true",
            "90, false",
            "90, true",
            "100, true",
            "60, false"
        ]
    )
    fun shouldReturnTrue(temp: Int, isSummer: Boolean) {
        assertThat(squirrelPlay(temp, isSummer)).isTrue()
    }
}
