import kek.mem
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTests {

    @Test
    @DisplayName("mem")
    fun mem_test() {
        assertEquals("mem", mem())
    }
}