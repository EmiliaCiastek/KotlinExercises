package string2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CatDogTest {

    @ParameterizedTest
    @ValueSource(strings = ["catcat", "catxxdogxxxdog", "catxdogxdogxca", "dogdogcat", "dog", "cat"])
    fun shouldReturnFalse(str: String) {
        assertThat(catDog(str)).isFalse()
    }

    @ParameterizedTest
    @ValueSource(strings = ["catdog", "1cat1cadodog", "catxdogxdogxcat", "dogogcat", "ca", "c", ""])
    fun shouldReturnTrue(str: String) {
        assertThat(catDog(str)).isTrue()
    }
}