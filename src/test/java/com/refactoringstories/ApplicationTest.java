package com.refactoringstories;

import org.junit.Test;

import static org.junit.Assert.*;


public class ApplicationTest {

    @Test
    public void helloIsReturned() throws Exception {
        // GIVEN
        String expected = "Hello World!";
        Application application = new Application();

        // WHEN
        String actual = application.sayHello();

        // THEN
        assertEquals(actual, expected);
    }
}