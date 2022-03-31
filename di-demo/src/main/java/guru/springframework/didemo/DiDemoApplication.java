package guru.springframework.didemo;

import guru.springframework.didemo.mycontroller.ConstructorInjectedController;
import guru.springframework.didemo.mycontroller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");
        myController.hello();

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());
    }

}
