package com.spring.test;

import com.spring.model.Truck;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class WidgetController {

    @RequestMapping(value = "/api", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index ()
    {
        return "Hello from the other site";
    }


}
