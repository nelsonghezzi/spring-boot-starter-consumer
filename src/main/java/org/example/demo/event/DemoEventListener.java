package org.example.demo.event;

import org.example.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener implements EventListener {
    @Override
    public String getEventName() {
        return "PingEvent";
    }

    @Override
    public void onEvent() {
        System.out.println("A ping has been made");
    }
}
