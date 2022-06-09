package net.mefmor.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testMain() {
        Main.main(new String[]{});

        Assertions.assertEquals("Hello!", outContent.toString());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }
}