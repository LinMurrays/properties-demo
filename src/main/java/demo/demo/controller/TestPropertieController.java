package demo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个controller是用来测试@vaule的
 */
@RestController
public class TestPropertieController {

    @Value("${person.last-name}")
    private String p1;

    @Value("#{11*2}")
    private Integer age;

    @RequestMapping("/TestProperties")
    public String hello(){
        return age.toString()+p1;
    }
    /**
     * return 22hello
     *
     *  person:
     *    lastName: hello
     */
}
