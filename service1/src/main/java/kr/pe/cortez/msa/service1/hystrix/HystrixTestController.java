package kr.pe.cortez.msa.service1.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HystrixTestController {

    @Autowired
    HystrixTestService hystrixTestService;

    @GetMapping(value = "/hystrix1")
    public String hystrix1() {
        String id = "1";
        return hystrixTestService.getName(id);
    }

    @GetMapping(value = "/hystrix2")
    public String hystrix2() {
        String id = "1";
        return hystrixTestService.getIdInfo(id);
    }

}