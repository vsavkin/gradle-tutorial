package com.example.multimodule.application;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoApplicationTest9 {

    @Test
    public void test1() throws InterruptedException {
        sleep(3000);
        assertThat("cat").isEqualTo("cat");
    }

    @Test
    public void test2() throws InterruptedException {
        sleep(3000);
        assertThat("dog").isEqualTo("dog");
    }

    @Test
    public void test4() throws InterruptedException {
        sleep(3000);
        assertThat("horse").isEqualTo("horse");
    }

    @Test
    public void test5() throws InterruptedException {
        sleep(3000);
        assertThat("cow").isEqualTo("cow");
    }

    @Test
    public void test6() throws InterruptedException {
        sleep(3000);
        assertThat("goat").isEqualTo("goat");
    }

}
