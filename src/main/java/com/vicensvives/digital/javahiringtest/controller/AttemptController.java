package com.vicensvives.digital.javahiringtest.controller;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.response.CreateAttemptResponse;
import com.vicensvives.digital.javahiringtest.mapper.ActivityStatsMapper;
import com.vicensvives.digital.javahiringtest.mapper.AttemptMapper;
import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import com.vicensvives.digital.javahiringtest.model.Attempt;
import com.vicensvives.digital.javahiringtest.service.ActivityStatsService;
import com.vicensvives.digital.javahiringtest.service.AttemptService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.vicensvives.digital.javahiringtest.mapper.ActivityStatsMapper.createAttemptRequestToActivityStats;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class AttemptController {

    @Autowired
    private AttemptService attemptService;

    @Autowired
    private ActivityStatsService activityStatsService;

    @PostMapping(value = "/attempts", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public CreateAttemptResponse createAttempt(@RequestBody CreateAttemptRequest request) {
        Attempt attempt = AttemptMapper.createAttemptRequestToAttempt(request);
        attemptService.save(attempt);
        ActivityStats activityStats = createAttemptRequestToActivityStats(request);
        activityStatsService.saveOrUpdate(activityStats);
        return new CreateAttemptResponse(attempt.getUuid());
    }

    @ExceptionHandler(BadHttpRequest.class)
    public ResponseEntity<String> badRequest(BadHttpRequest e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(UnsupportedOperationException.class)
    public ResponseEntity<String> invalidGrade(UnsupportedOperationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
