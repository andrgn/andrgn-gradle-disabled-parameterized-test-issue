import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ParameterizedTest {

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = ["First Name", "Second Name"])
    fun parameterizedTest(testParam: String) {
        assertEquals(testParam, testParam)
    }

    @Disabled
    @Test
    fun fakeParameterizedTest() {
        assertEquals(1, 1)
    }
}