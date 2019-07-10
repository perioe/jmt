package com.jmt.api.jmtapi;

import com.jmt.core.jmtcore.Sample;
import com.jmt.core.jmtcore.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiSampleService {

    @Autowired
    private SampleService sampleService;

    public Sample getSample(String id) {

        return sampleService.getSample(id);
    }
}
