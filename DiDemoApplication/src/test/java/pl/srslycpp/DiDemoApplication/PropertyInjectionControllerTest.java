package pl.srslycpp.DiDemoApplication;

import org.junit.Before;
import org.junit.Test;
import pl.srslycpp.DiDemoApplication.controllers.PropertyInjectionController;
import pl.srslycpp.DiDemoApplication.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectionControllerTest {

    public PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
       assertEquals(GreetingServiceImpl.GREETING, propertyInjectionController.sayHello());
    }
}
