package guru.springframework.didemo.mycontroller;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectionController {

    @Autowired
    private GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
