package org.spring.springboot.controller;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Spring Boot HelloWorld案例
 *
 * Created by wengxx on 17/8/19.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value="/")
    public String sayHello(){
        return "Hello,World!";
    }
}
