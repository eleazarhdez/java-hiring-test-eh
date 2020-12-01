import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import com.vicensvives.digital.javahiringtest.repository.ActivityStatsRepository;
import com.vicensvives.digital.javahiringtest.service.ActivityStatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ActivityStatsServicesTest {

    @Mock
    ActivityStatsRepository activityStatsRepository;

    @Mock
    ActivityStats mockedActivityStats;

    @InjectMocks
    ActivityStatsService activityStatsService;

    @Test
    public void findByIdTest(){
        when(mockedActivityStats.getUser_id()).thenReturn("John");
        when(mockedActivityStats.getActivity_id()).thenReturn("Math");
        when(activityStatsRepository.findById(mockedActivityStats)).thenReturn(mockedActivityStats);
        ActivityStats activityStats = activityStatsService.findById(mockedActivityStats);
        Assertions.assertEquals(activityStats.getUser_id(), activityStats.getUser_id());
        Assertions.assertEquals(activityStats.getActivity_id(), activityStats.getActivity_id());
    }

    @Test
    public void findByAllTest(){
        ActivityStats mockedActivityStatsB = Mockito.mock(ActivityStats.class);
        List<ActivityStats> activityStatsList = new ArrayList<>();
        activityStatsList.add(mockedActivityStats);
        activityStatsList.add(mockedActivityStatsB);
        when(activityStatsRepository.findAll()).thenReturn(activityStatsList);
        List<ActivityStats> resultActivityStatsList = activityStatsService.findAll();
        Assertions.assertEquals(resultActivityStatsList.size(), 2);
        Assertions.assertTrue(resultActivityStatsList.contains(mockedActivityStats));
        Assertions.assertTrue(resultActivityStatsList.contains(mockedActivityStatsB));
    }
}
