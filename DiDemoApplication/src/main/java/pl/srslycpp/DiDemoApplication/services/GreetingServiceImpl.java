package pl.srslycpp.DiDemoApplication.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Greetings From GreetingServiceImpl";
    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
