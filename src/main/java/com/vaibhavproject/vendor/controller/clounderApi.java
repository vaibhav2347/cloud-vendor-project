package com.vaibhavproject.vendor.controller;

import com.vaibhavproject.vendor.cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class clounderApi {
    cloudvendor cloudvendor;
    @GetMapping("{vendorId}")

    public cloudvendor getvendordata(String vendorId){

        return   cloudvendor;
    }
    @PostMapping
    public String createvendordata ( @RequestBody cloudvendor cloudvendor){
        this.cloudvendor = cloudvendor;
        return " Cloud vendor created successfully";
    }
    @PutMapping
    public String updatevendordata ( @RequestBody cloudvendor cloudvendor){
        this.cloudvendor = cloudvendor;
        return " Cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deletevendordata (String vendorId){
        this.cloudvendor = null;
        return " Cloud vendor deleted successfully";
    }
}
