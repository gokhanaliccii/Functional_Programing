package function.pure;

import function.Predicate;

import java.util.List;

public class EmptyListPredicate<T> implements Predicate<List<T>> {

    @Override
    public boolean is(List list) {
        return list == null || list.size() == 0;
    }

}
