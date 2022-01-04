package com.starter.startingspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test-list")
    public List<TestModel> getList(){
        return Collections.singletonList(new TestModel(1l,"Test String"));
    }
}
