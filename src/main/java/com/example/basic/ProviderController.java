package com.example.basic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class ProviderController {

    @RequestMapping(value ="/provider", method = RequestMethod.GET )
    @ResponseBody
    public Object provide() {
                return ResponseEntity
                        .status(200)
                        .body(new ReturnedValues("12345", 12345, Arrays.asList("This", "Little", "Array")));
        }
}
