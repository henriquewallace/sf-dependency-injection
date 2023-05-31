package guru.springframework.sfdependencyinjection;

import guru.springframework.sfdependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.sfdependencyinjection.controllers.MyController;
import guru.springframework.sfdependencyinjection.controllers.PropertyInjectedController;
import guru.springframework.sfdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfDependencyInjectionApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);

        System.out.println("----- Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
