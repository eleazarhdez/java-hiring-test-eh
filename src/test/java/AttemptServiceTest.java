import com.vicensvives.digital.javahiringtest.model.Attempt;
import com.vicensvives.digital.javahiringtest.repository.AttemptRepository;
import com.vicensvives.digital.javahiringtest.service.AttemptService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AttemptServiceTest {
//        AttemptService attemptService = new AttemptService();
        @Mock
        AttemptRepository attemptRepository;

        @InjectMocks
        AttemptService attemptService;

        @Test
        public void saveAttemptTest() {
            Attempt mockedAttempt = Mockito.mock(Attempt.class);
            AttemptRepository mockedAttemptRepository = Mockito.mock(AttemptRepository.class);
            when(mockedAttempt.getUuid()).thenReturn("AAA-BBB");
            when(mockedAttempt.getGrade()).thenReturn(90);

            when(mockedAttemptRepository.save(mockedAttempt)).thenReturn(mockedAttempt);
            String uuid = attemptService.save(mockedAttempt).getUuid();
            Assertions.assertEquals(uuid, mockedAttempt.getUser_id());
            Assertions.assertEquals(1, 1);

        }
}
