import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class Ex5Test {

    @ParameterizedTest
    @ValueSource(strings = ["abc", "booo", "Hello", "af", "bf"])
    fun shouldReturnUnchangedString(str: String) {
        assertThat(fizzString(str)).isEqualTo(str)
    }

    @ParameterizedTest
    @ValueSource(strings = ["fig", "fooo", "f"])
    fun shouldReturnFizz(str: String) {
        assertThat(fizzString(str)).isEqualTo("Fizz")
    }

    @ParameterizedTest
    @ValueSource(strings = ["dib", "ooob", "abcb", "b", "Hellob"])
    fun shouldReturnBuzz(str: String) {
        assertThat(fizzString(str)).isEqualTo("Buzz")
    }

    @ParameterizedTest
    @ValueSource(strings = ["fib", "fooob", "fb"])
    fun shouldReturnFizzBuzz(str: String) {
        assertThat(fizzString(str)).isEqualTo("FizzBuzz")
    }
}
