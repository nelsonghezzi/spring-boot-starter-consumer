package org.example.demo.controller;

import org.example.event.EventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final EventPublisher eventPublisher;

    public DemoController(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/ping")
    public String ping() {
        eventPublisher.publish("PingEvent");
        return "pong";
    }
}
