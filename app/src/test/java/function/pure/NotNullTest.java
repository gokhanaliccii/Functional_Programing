package function.pure;

import model.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NotNullTest {

    @Test
    public void shouldDetectNullStringCorrectly() {
        User user = null;
        boolean shouldObjNull = new NotNull().is(user);

        assertFalse(shouldObjNull);
    }

    @Test
    public void shouldDetectNullListCorrectly() {
        List<User> users = null;
        boolean listTobeNull= new NotNull().is(users);

        assertFalse(listTobeNull);
    }

}