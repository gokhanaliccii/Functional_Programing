package checker;

import function.Predicate;
import function.pure.NullPredicate;

public class ConditionChecker {

    public static <T> boolean isNull(T t) {
        return new NullPredicate<>().is(t);
    }

}
