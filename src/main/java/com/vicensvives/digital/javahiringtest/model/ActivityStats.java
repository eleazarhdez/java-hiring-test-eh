package com.vicensvives.digital.javahiringtest.model;

import lombok.Data;

@Data
public class ActivityStats {
    private String activity_id;
    private String user_id;
    private Integer accumulated_grade;
    private Integer average_grade;
    private Integer attempts_number;
    private Boolean manual;
    private String comment;

    public void increaseAttemptNumbers(){
         ++this.attempts_number;
    }
    public void accumulateGrade(Integer grade){
        this.accumulated_grade = this.accumulated_grade + grade;
    }

    public void calculateAverage(){
        if (!this.manual) {
            this.average_grade = this.accumulated_grade / this.attempts_number;
        }
    }

    public void updateStatsAfterAttempt(Integer grade){
        accumulateGrade(grade);
        increaseAttemptNumbers();
        calculateAverage();
    }
}
