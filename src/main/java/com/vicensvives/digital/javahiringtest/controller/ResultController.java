package com.vicensvives.digital.javahiringtest.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.request.UpdateResultRequest;
import com.vicensvives.digital.javahiringtest.controller.response.UserResultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResultController {

    @GetMapping(value = "/results", produces = APPLICATION_JSON_VALUE)
    public List<UserResultResponse> getResults() {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }

    @PatchMapping(value = "/results", consumes = APPLICATION_JSON_VALUE)
    public void updateResult(
        @RequestParam String activityId,
        @RequestParam String userId,
        @RequestBody UpdateResultRequest request
    ) {
        //TODO implement
        throw new RuntimeException("Not implemented yet");
    }

}
