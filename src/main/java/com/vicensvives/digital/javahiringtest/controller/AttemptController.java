package com.vicensvives.digital.javahiringtest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.response.CreateAttemptResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttemptController {

    @RequestMapping(
        method = RequestMethod.POST, value = "/attempts",
        produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE
    )
    public CreateAttemptResponse createAttempt(@RequestBody CreateAttemptRequest request) {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }
}
