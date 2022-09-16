package com.makeindigitaal.coffeeshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShreeGaneshayanamha {
    @GetMapping("/")
    public String RadheRadhe(){
        return "Jai Shree Ram";
    }
}
