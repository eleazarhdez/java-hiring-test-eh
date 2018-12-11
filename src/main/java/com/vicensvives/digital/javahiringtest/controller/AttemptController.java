package com.vicensvives.digital.javahiringtest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.response.CreateAttemptResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttemptController {

    @PostMapping(value = "/attempts", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public CreateAttemptResponse createAttempt(@RequestBody CreateAttemptRequest request) {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }
}
