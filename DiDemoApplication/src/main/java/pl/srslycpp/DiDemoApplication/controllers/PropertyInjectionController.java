package pl.srslycpp.DiDemoApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.srslycpp.DiDemoApplication.services.GreetingServiceImpl;

@Controller
public class PropertyInjectionController {

    //hard Type, called by Type so spring know how to do dependency injection this type
    // We can change the GreetingServiceImpl to interface GreetingService but we must also change property name to the bean name
    // in our case it will be greetingServiceImpl
    // So we have type of interface but the name of the property is the bean name little shortcut
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
