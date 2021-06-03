package com.test.loader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(JUnit4.class)
public class TestLoader {

    @Test
    public void test() throws Exception {
        Path path = Paths.get(ClassLoader.getSystemResource("db/test.sql").toURI());

        System.out.println(path.toFile().exists());
    }
}
