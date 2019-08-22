import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Ex3Test {

    @ParameterizedTest
    @CsvSource(value = [
        "Bob, Hello Bob!",
        "Alice, Hello Alice!",
        "X, Hello X!",
        "Alpha, Hello Alpha!",
        "ho ho ho, Hello ho ho ho!",
        "Hello , Hello Hello!",
        "xyz, Hello xyz!"
    ])
    fun shouldReturnHelloWithName(name: String, result: String) {
        assertThat(helloName(name)).isEqualTo(result)
    }
}
