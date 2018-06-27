package pl.srslycpp.DiDemoApplication;

import org.junit.Before;
import org.junit.Test;
import pl.srslycpp.DiDemoApplication.controllers.ConstructorInjectionController;
import pl.srslycpp.DiDemoApplication.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() throws Exception{
        constructorInjectionController = new ConstructorInjectionController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.GREETING, constructorInjectionController.sayHello());
    }
}
