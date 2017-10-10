package function.pure;

import model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotNullTest {

    @Test
    public void shouldDetectNullStringCorrectly() {
        User user = null;
        boolean shouldObjNull = new NotNull().is(user);

        assertFalse(shouldObjNull);
    }

}