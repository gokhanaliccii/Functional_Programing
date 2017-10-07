package function.chain;

import function.pure.EqualPredicate;
import function.pure.NotNull;
import function.pure.NullPredicate;
import model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChainedPredicateTest {

    @Test
    public void shouldApplyChainedPredicates() {
        User user = new User("Begum", "Alıcı");
        User sameUser = new User("Begum", "Alıcı");

        boolean passed = new ChainedPredicate<>(user)
                .predicate(new NotNull())
                .predicate(new EqualPredicate(sameUser))
                .check();

        assertTrue(passed);
    }

}