package pl.srslycpp.DiDemoApplication.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting From SetterGreetingService";
    }
}
