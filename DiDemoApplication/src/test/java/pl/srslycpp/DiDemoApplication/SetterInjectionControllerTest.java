package pl.srslycpp.DiDemoApplication;

import org.junit.Before;
import org.junit.Test;
import pl.srslycpp.DiDemoApplication.controllers.SetterInjectionController;
import pl.srslycpp.DiDemoApplication.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;


    @Before
    public void setUp(){
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.GREETING, setterInjectionController.sayHello());
    }
}
