import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun should_ReturnCorrectPercentage_When_CorrectInput() {
        //Given
        val firstChar = "a"
        val secondChar = "b"

        //When
        val result = calculateCharacters(listOf(firstChar,secondChar,secondChar))

        //Then
        assertEquals(33.3,result)
    }
    @Test
    fun should_ReturnMinus1_When_StringsMoreThane1Char() {
        //Given
        val firstChar = "abdulaziz"
        val secondChar = "bk"

        //When
        val result = calculateCharacters(listOf(firstChar,secondChar))

        //Then
        assertEquals(-1,result)
    }
    @Test
    fun should_ReturnMinus1_When_CharactersIsWrong() {
        //Given
        val firstChar = "u"
        val secondChar = "k"

        //When
        val result = calculateCharacters(listOf(firstChar,secondChar))

        //Then
        assertEquals(-1,result)
    }
    @Test
    fun should_ReturnMinus1_When_CharactersNot_a_But_b() {
        //Given
        val firstChar = "s"
        val secondChar = "b"

        //When
        val result = calculateCharacters(listOf(firstChar,secondChar))

        //Then
        assertEquals(-1,result)
    }
    @Test
    fun should_ReturnMinus1_When_CharactersNot_b_But_a() {
        //Given
        val firstChar = "s"
        val secondChar = "b"

        //When
        val result = calculateCharacters(listOf(firstChar,secondChar))

        //Then
        assertEquals(-1,result)
    }
    @Test
    fun should_ReturnMinus1_When_ListIsEmpty() {
        //Given
        val firstChar = "s"
        val secondChar = "b"

        //When
        val result = calculateCharacters(listOf())
        //Then
        assertEquals(-1,result)
    }
    @Test
    fun should_ReturnZero_When_aNotFound() {
        //Given
        val secondChar = "b"

        //When
        val result = calculateCharacters(listOf(secondChar))
        //Then
        assertEquals(0,result)
    }
}