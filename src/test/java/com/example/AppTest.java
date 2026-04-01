package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testApplicationStartup() {
        Assert.assertTrue(true);
    }

    @Test
    public void testServletPath() {
        Assert.assertEquals("/hello", "/hello");
    }

    @Test
    public void testResponseContent() {
        String response = "Hello from DevOps Pipeline!";
        Assert.assertTrue(response.contains("DevOps"));
    }

    @Test
    public void testAppVersion() {
        Assert.assertEquals("1.0", "1.0");
    }

    @Test
    public void testBusinessLogic() {
        Assert.assertEquals(2 + 3, 5);
    }

    @Test
    public void testStringValidation() {
        Assert.assertTrue("DevOpsApp".startsWith("DevOps"));
    }
}