package string2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PrefixAgainTest {

    @ParameterizedTest
    @CsvSource(
        value = [
            "abXYabc, 3",
            "xyzxyxyxy, 3",
            "Hi12345Hi6789Hi10, 4",
            "a, 1",
            "ab ,1"
        ]
    )
    fun shouldReturnFalse(str: String, n: Int) {
        assertThat(prefixAgain(str, n)).isFalse()
    }

    @ParameterizedTest
    @CsvSource(
        value = [
            "abXYabc, 1",
            "abXYabc, 2",
            "xyzxyxyxy, 2",
            "Hi12345Hi6789Hi10, 1",
            "Hi12345Hi6789Hi10 ,2",
            "Hi12345Hi6789Hi10, 3",
            "aa, 1"
        ]
    )
    fun shouldReturnTrue(str: String, n: Int) {
        assertThat(prefixAgain(str, n)).isTrue()
    }
}
