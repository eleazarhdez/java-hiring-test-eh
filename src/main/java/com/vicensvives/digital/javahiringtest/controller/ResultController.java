package com.vicensvives.digital.javahiringtest.controller;

import static com.vicensvives.digital.javahiringtest.mapper.ActivityStatsMapper.updateResultRequestToActivityStats;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.vicensvives.digital.javahiringtest.controller.request.UpdateResultRequest;
import com.vicensvives.digital.javahiringtest.controller.response.UserResultResponse;
import com.vicensvives.digital.javahiringtest.mapper.ActivityStatsMapper;
import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import com.vicensvives.digital.javahiringtest.service.ActivityStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResultController {

    @Autowired
    public ActivityStatsService activityStatsService;

    @GetMapping(value = "/results", produces = APPLICATION_JSON_VALUE)
    public List<UserResultResponse> getResults() {
        List<ActivityStats> activityStatsList = activityStatsService.findAll();
        List<UserResultResponse> result = ActivityStatsMapper.groupResultsByUser(activityStatsList);
        return result;
    }

    @PatchMapping(value = "/results", consumes = APPLICATION_JSON_VALUE)
    public void updateResult(
        @RequestParam String activityId,
        @RequestParam String userId,
        @RequestBody UpdateResultRequest request
    ) {
        ActivityStats activityStats = updateResultRequestToActivityStats(activityId, userId, request);
        activityStatsService.updateAverageGrade(activityStats);
    }

}
