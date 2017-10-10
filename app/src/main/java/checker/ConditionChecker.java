package checker;

import function.pure.EmptyListPredicate;
import function.pure.EqualPredicate;
import function.pure.NullPredicate;

import java.util.List;

public class ConditionChecker {

    public static <T> boolean isNull(T t) {
        return new NullPredicate<>().is(t);
    }

    public static <T> boolean isEmptyList(List<T> t) {
        return new EmptyListPredicate().is(t);
    }

    public static <T> boolean isEqual(T lhs ,T rhs){
        return new EqualPredicate(lhs).is(rhs);
    }



}
