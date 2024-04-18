package com.ixbitz.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DatabaseServiceIT {

    @Test
    void testDatabaseConnection() {
        assertTrue(DatabaseService.connect());
    }
}
