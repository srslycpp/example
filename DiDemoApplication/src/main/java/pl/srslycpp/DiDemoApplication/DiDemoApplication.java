package pl.srslycpp.DiDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.srslycpp.DiDemoApplication.controllers.ConstructorInjectionController;
import pl.srslycpp.DiDemoApplication.controllers.MyController;
import pl.srslycpp.DiDemoApplication.controllers.PropertyInjectionController;
import pl.srslycpp.DiDemoApplication.controllers.SetterInjectionController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = 	SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());

	}
}