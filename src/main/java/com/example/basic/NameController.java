package com.example.basic;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@RestController
public class NameController {

    @RequestMapping(value ="/name/{first}", method = RequestMethod.GET )
    @ResponseBody
    public Object getFirstName(
        @PathVariable(value ="first") String first, @RequestParam (value = "last", required=false) String last) {
            if(last == null)
                return new Car("BMW", 2015, Arrays.asList("AirCon", "AirBag", "Power Steering"));
            else
                return "First name is " + first + " last name is " + last;
        }
    }
