package function.pure;

import function.predicate.Predicate;

public class NotNull implements Predicate {

    @Override
    public boolean is(Object o) {
        return o != null;
    }
}
