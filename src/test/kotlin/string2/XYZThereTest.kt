package string2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class XYZThereTest {

    @ParameterizedTest
    @ValueSource(strings = ["abcxyz", "xyz.abc", "xyz", "abc.xyzxyz", "abc.xxyz", "12xyz" ])
    fun shouldReturnTrue(str: String){
        assertThat(xyzThere(str)).isTrue()
    }

    @ParameterizedTest
    @ValueSource(strings = ["abc.xyz", "abcxy", "xy", "x", "", ".xyz", "12.xyz", "1.xyz.xyz2.xyz"])
    fun shouldReturnFalse(str: String){
        assertThat(xyzThere(str)).isFalse()
    }
}
