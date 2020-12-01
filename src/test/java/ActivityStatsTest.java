import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ActivityStatsTest {

    ActivityStats activityStats = new ActivityStats();

    @BeforeEach
    public void loadActivityStats () {
        activityStats.setAccumulated_grade(10);
        activityStats.setAttempts_number(2);
        activityStats.setAverage_grade(15);
    }

    @Test
    public void calculateAverage(){
        activityStats.setManual(false);
        activityStats.calculateAverage();
        Assertions.assertEquals(activityStats.getAverage_grade(), 5);
    }

    @Test
    public void calculateAverageWithManualTrue(){
        activityStats.setManual(true);
        activityStats.calculateAverage();
        Assertions.assertEquals(activityStats.getAverage_grade(), 15);
    }

    @Test
    public void accumulateGradeTest(){
        activityStats.accumulateGrade(10);
        Assertions.assertEquals(activityStats.getAccumulated_grade(), 20);
    }

    @Test
    public void increaseAttemptNumbersTest(){
        activityStats.increaseAttemptNumbers();
        Assertions.assertEquals(activityStats.getAttempts_number(), 3);
    }

    @Test
    public void updateStatsAfterAttemptTest(){
        activityStats.setManual(false);
        activityStats.updateStatsAfterAttempt(20);
        Assertions.assertEquals(activityStats.getAttempts_number(), 3);
        Assertions.assertEquals(activityStats.getAccumulated_grade(), 30);
        Assertions.assertEquals(activityStats.getAverage_grade(), 10);
    }

}
