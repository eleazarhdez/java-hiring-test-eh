package com.vicensvives.digital.javahiringtest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.response.GradeResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @RequestMapping(
        method = RequestMethod.GET, value = "/grades",
        produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE
    )
    public GradeResponse getGrades(@RequestParam String resourceId, @RequestParam String userId) {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }
}
