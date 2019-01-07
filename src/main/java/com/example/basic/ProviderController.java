package com.example.basic;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class ProviderController {

    @RequestMapping(value ="/provider", method = RequestMethod.GET )
    @ResponseBody
    public Object provide() {
                return new ReturnedValues("12345", 2019, Arrays.asList("This", "Little", "Array"));
        }
}
