package pl.altkom.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloUtilTest {

    @Test
    @DisplayName("Bradzo dlugi opis testu")
    void shouldReturnGreetingWithPassedArgument (){
        //given
        String passedArgument = "World";
        String expectedValue = HelloUtil.GREETING+" "+passedArgument;
        //When
        String returnValue = HelloUtil.hello(passedArgument);
        //Then
        assertEquals(expectedValue, returnValue);
    }

}