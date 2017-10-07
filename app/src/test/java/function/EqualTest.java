package function;

import checker.ConditionChecker;
import model.User;
import org.junit.Assert;
import org.junit.Test;

import static checker.ConditionChecker.isEqual;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualTest {

    @Test
    public void shouldUserObjectEquals() throws Exception {
        final User expected = new User("gokhan", "alıcı");
        final User actual = new User("gokhan", "alıcı");

        assertTrue(isEqual(expected, actual));
    }

    @Test
    public void shouldUserObjectsNotEqual(){
        final User expected = new User("gokhan", "alıcı");
        final User actual = new User("gokhan", "alı");

        assertFalse(isEqual(expected, actual));
    }

}
