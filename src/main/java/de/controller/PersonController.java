package de.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PersonController {
    @GetMapping("/")
    public Flux<String> list() {
        return Flux.range(1, 20)
                .map(i -> Integer.toString(i));
    }
}
