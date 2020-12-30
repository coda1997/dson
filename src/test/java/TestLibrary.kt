import kotlin.test.Test
import kotlin.test.assertTrue

class TestLibrary {
    @Test
    fun testSomeMethod(){
        val testClass = Library()
        assertTrue(testClass.someMethod(), "someMethod method in library class should return true")
    }
}