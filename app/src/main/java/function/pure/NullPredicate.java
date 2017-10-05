package function.pure;

import function.Predicate;

public class NullPredicate <T> implements Predicate<T> {

    @Override
    public boolean is(Object o) {
        return o == null;
    }


}
