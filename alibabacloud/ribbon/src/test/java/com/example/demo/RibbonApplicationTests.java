package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class RibbonApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.compareAndSet(1, 2);
        System.out.println(atomicInteger.get());
    }
}
