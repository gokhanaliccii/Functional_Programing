package function;

import checker.ConditionChecker;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonadTest {

    @Test
    public void shouldConvertStringToIntCorrectly() throws Exception {
        final Integer expectedValue = 1;

        Integer actual = Monad.just("1").map(new Func<String, Monad<Integer>>() {

            @Override
            public Monad<Integer> to(String s) {
                return Monad.just(Integer.parseInt(s));
            }
        }).get();

        assertTrue(ConditionChecker.isEqual(expectedValue, actual));
    }
}