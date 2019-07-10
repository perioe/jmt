package com.jmt.core.jmtcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    @Transactional(readOnly = true)
    public Sample getSample(String id) {
        return sampleRepository.findById(id).get();
    }
}
