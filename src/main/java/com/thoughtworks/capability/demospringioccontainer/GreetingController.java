
package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;


@RestController
@Scope(SCOPE_SINGLETON)
public class GreetingController {

    private final ApplicationContext applicationContext;

    public GreetingController(ApplicationContext applicationContext) {
        System.out.println("Greetings.");
        this.applicationContext = applicationContext;
    }

    @GetMapping("/greet")
    public String greet() {
        return applicationContext.getBean(GreetingService.class).sayHi();
    }

}
