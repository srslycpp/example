package pl.srslycpp.DiDemoApplication.controllers;

import org.springframework.stereotype.Controller;
import pl.srslycpp.DiDemoApplication.services.GreetingService;

@Controller
public class ConstructorInjectionController {

    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
