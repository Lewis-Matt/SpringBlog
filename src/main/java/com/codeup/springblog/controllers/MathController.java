package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// TODO: This controller should listen for requests for several routes that correspond to basic arithmetic operations and produce the result of the arithmetic.
@Controller
public class MathController {
    @RequestMapping("/add/{x}/and/{y}")
    // Tells Spring that whatever is returned from this method should be the body of our response
    @ResponseBody
    public long add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @RequestMapping("/subtract/{x}/and/{y}")
    @ResponseBody
    public long subtract(@PathVariable int x, @PathVariable int y) {
        return x - y;
    }

    @RequestMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public long multiply(@PathVariable int x, @PathVariable int y) {
        return (long) x * y;
    }

    @RequestMapping("/divide/{x}/and/{y}")
    @ResponseBody
    public long divide(@PathVariable int x, @PathVariable int y) {
        return x / y;
    }
}

