package com.restservicecors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {
    private static final String welcoming = "Hello, %s!";
    private final AtomicLong idCount = new AtomicLong();

    @CrossOrigin(
            origins = "http://localhost:3005"

    )
    @GetMapping("/helloworld")
    public HelloWorld helloworld(@RequestParam(required = false, defaultValue="World") String name,
                                 @RequestParam(required = false, defaultValue="1,2,3") String[] arr) {
        System.out.println("==== get helloworld ====");
        return new HelloWorld(
                idCount.incrementAndGet(),
                String.format(welcoming, name),
                arr
        );
    }
}
