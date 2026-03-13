package com.example.appengine.java8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/add")
    public int add(@RequestParam int n, @RequestParam int m) {
        return n + m;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int n, @RequestParam int m) {
        return n - m;
    }

    @GetMapping("/times")
    public int times(@RequestParam int n, @RequestParam int m) {
        return n * m;
    }

    @GetMapping("/div")
    public int div(@RequestParam int n, @RequestParam int m) {
        return n / m;
    }

    @GetMapping("/neg")
    public int neg(@RequestParam int n) {
        return -n;
    }
}
