package function.pure;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualPredicateTest {

    @Test
    public void shouldUserObjectEquals() throws Exception {
        User user = new User("begum", "alıcı");
        User copyOfUser = new User("begum", "alıcı");

        boolean shouldEqual = new EqualPredicate(user).is(copyOfUser);

        assertTrue(shouldEqual);
    }
}