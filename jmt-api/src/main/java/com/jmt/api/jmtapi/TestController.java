package com.jmt.api.jmtapi;

import com.jmt.core.jmtcore.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ApiSampleService apiSampleService;

    @GetMapping("{id}")
    public Sample getSample( @PathVariable String id) {

        return apiSampleService.getSample(id);
    }
}
