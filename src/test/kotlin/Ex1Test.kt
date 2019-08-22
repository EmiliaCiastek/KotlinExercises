import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class Ex1Test {

    @Test
    fun shouldReturnFalseWhenEmptyString() {
        assertThat(startHi("")).isFalse()
    }

    @Test
    fun shouldReturnFalseWhenShortString() {
        assertThat(startHi("h")).isFalse()
    }

    @ParameterizedTest
    @ValueSource(strings = ["hello hi", "he", "ho hi"])
    fun shouldReturnFalse(incorrectString: String) {
        assertThat(startHi(incorrectString)).isFalse()
    }

    @ParameterizedTest
    @ValueSource(strings = ["hi there", "hi", "hi ho"])
    fun shouldReturnTrue(correctString: String) {
        assertThat(startHi(correctString)).isTrue()
    }
}
