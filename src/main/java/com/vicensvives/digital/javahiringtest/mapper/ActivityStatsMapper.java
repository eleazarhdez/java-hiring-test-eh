package com.vicensvives.digital.javahiringtest.mapper;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.request.UpdateResultRequest;
import com.vicensvives.digital.javahiringtest.controller.response.ResultResponse;
import com.vicensvives.digital.javahiringtest.controller.response.UserResultResponse;
import com.vicensvives.digital.javahiringtest.model.ActivityStats;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActivityStatsMapper {

    public static ActivityStats updateResultRequestToActivityStats (String activityId, String userId,
                                                             UpdateResultRequest updateResultRequest) {
        ActivityStats activityStats = new ActivityStats();
        activityStats.setActivity_id(activityId);
        activityStats.setUser_id(userId);
        activityStats.setAverage_grade(updateResultRequest.getGrade());
        activityStats.setComment(updateResultRequest.getComment());
        return activityStats;
    }

    public static ActivityStats createAttemptRequestToActivityStats (CreateAttemptRequest createAttemptRequest) {
        ActivityStats activityStats = new ActivityStats();
        activityStats.setActivity_id(createAttemptRequest.getActivityId());
        activityStats.setUser_id(createAttemptRequest.getUserId());
        activityStats.setAverage_grade(createAttemptRequest.getGrade());
        return activityStats;
    }

    public static List<ResultResponse> activityListToResultResponse (List<ActivityStats> activityStats){
        List<ResultResponse> resultsResponse = new ArrayList<>();
        activityStats.forEach(activityStat -> resultsResponse.add(new ResultResponse(activityStat.getActivity_id(),
                activityStat.getAverage_grade())));
        return resultsResponse;
    }

    public static List<UserResultResponse> groupResultsByUser (List<ActivityStats> activitiesStats){
        Map<String, List<ActivityStats>> activitiesGroupedByUser =
                activitiesStats.stream().collect(Collectors.groupingBy(w -> w.getUser_id()));

        List<UserResultResponse> usersResultsResponse = new ArrayList<>();
        activitiesGroupedByUser.entrySet().stream().forEach(e -> usersResultsResponse.add(
                new UserResultResponse(e.getKey(), activityListToResultResponse(e.getValue()))));
        return usersResultsResponse;
    }
}
