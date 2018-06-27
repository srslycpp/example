package pl.srslycpp.DiDemoApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.srslycpp.DiDemoApplication.services.GreetingService;

@Controller
public class PropertyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
