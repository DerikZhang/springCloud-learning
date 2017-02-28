package com.springCloud.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jim.huang on 2017/2/28.
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/test")
    String sayHelloWorld() {
        return "hello world";
    }
}
