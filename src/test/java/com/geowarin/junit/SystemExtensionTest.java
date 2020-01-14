package com.geowarin.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SystemExtension.class)
class SystemExtensionTest {

    @Test
    @EnvironmentVariable(key = "toto", value = "toto")
    void testEnv() {
        assertEquals(System.getenv("toto"), "toto");
    }
}
