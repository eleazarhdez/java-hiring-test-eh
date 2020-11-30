package com.vicensvives.digital.javahiringtest.mapper;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.model.Attempt;

public class AttemptMapper {

    public static Attempt createAttemptRequestToAttempt(CreateAttemptRequest createAttemptRequest) {
        Attempt attempt = new Attempt();
        attempt.setUser_id(createAttemptRequest.getUserId());
        attempt.setActivity_id(createAttemptRequest.getActivityId());
        attempt.setGrade(createAttemptRequest.getGrade());
        return attempt;
    }
}
