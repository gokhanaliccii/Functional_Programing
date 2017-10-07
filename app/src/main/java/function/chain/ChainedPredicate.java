package function.chain;

import function.Predicate;

import java.util.LinkedList;
import java.util.List;

public class ChainedPredicate<T> {

    private T target;
    private List<Predicate> predicates;

    public ChainedPredicate(T target) {
        this.target = target;

        predicates = new LinkedList<>();
    }

    public ChainedPredicate predicate(Predicate predicate) {
        predicates.add(predicate);
        return this;
    }

    public boolean check() {
        boolean passedPredicates = true;

        for (Predicate predicate : predicates) {
            passedPredicates &= predicate.is(target);

            if (!passedPredicates) {//loop breaker not need to continue;
                break;
            }
        }

        return passedPredicates;
    }

}
