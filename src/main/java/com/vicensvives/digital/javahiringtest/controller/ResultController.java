package com.vicensvives.digital.javahiringtest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.response.ResultResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @RequestMapping(method = RequestMethod.GET, value = "/results", produces = APPLICATION_JSON_VALUE)
    public ResultResponse getResult(@RequestParam String activityId, @RequestParam String userId) {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }
}
