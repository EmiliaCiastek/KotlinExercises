package logic1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class Less20Test {

    @ParameterizedTest
    @ValueSource(ints = [18, 19, 58, 59, 1018, 1019])
    fun shouldReturnTrue(n: Int) {
        assertThat(less20(n)).isTrue()
    }

    @ParameterizedTest
    @ValueSource(ints = [20, 21, 17, 8, 31, 30, 61, 62, 1017, 1020, 1021, 37])
    fun shouldReturnFalse(n: Int) {
        assertThat(less20(n)).isFalse()
    }
}