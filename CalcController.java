package com.example.appengine.java8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add")
    public int add(int n, int m) {
        return n + m;
    }

    @GetMapping("/subtract")
    public int subtract(int n, int m) {
        return n - m;
    }

    @GetMapping("/times")
    public int times(int n, int m) {
        return n * m;
    }

    @GetMapping("/div")
    public int div(int n, int m) {
        return n / m;
    }

    @GetMapping("/neg")
    public int neg(int n) {
        return -n;
    }
}
