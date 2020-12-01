import com.vicensvives.digital.javahiringtest.exceptions.InvalidDataValueException;
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

    @Mock
    AttemptRepository attemptRepository;

    @InjectMocks
    AttemptService attemptService;

    @Test
    public void saveAttemptTest() throws InvalidDataValueException {
        Attempt mockedAttempt = Mockito.mock(Attempt.class);
        when(mockedAttempt.getUuid()).thenReturn("AAA-BBB");
        when(mockedAttempt.getGrade()).thenReturn(90);

        when(attemptRepository.save(mockedAttempt)).thenReturn(mockedAttempt);
        String uuid = attemptService.save(mockedAttempt).getUuid();
        Assertions.assertEquals(uuid, mockedAttempt.getUuid());
    }

    @Test
    public void tryAttemptWithInvalidGrade() throws InvalidDataValueException {
        Attempt attempt = new Attempt();
        attempt.setGrade(200);
        AttemptService attemptService = new AttemptService();
        Assertions.assertThrows(InvalidDataValueException.class, () -> {
            attemptService.save(attempt);
        });
    }
}
