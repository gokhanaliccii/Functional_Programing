package function.pure;


import function.Predicate;

public class EqualPredicate implements Predicate {

    private Object expected;

    public EqualPredicate(Object expected) {
        this.expected = expected;
    }

    @Override
    public boolean is(Object actual) {
        return expected.equals(actual);
    }
}
