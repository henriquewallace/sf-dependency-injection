package guru.springframework.sfdependencyinjection.controllers;

import guru.springframework.sfdependencyinjection.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final PrimaryGreetingService primaryGreetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello() {
        System.out.println("Hello World!");

        return primaryGreetingService.sayGreeting();
    }
}
