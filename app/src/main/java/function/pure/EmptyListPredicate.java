package function.pure;

import function.Predicate;

import java.util.List;

public class EmptyListPredicate implements Predicate<List<?>> {

    @Override
    public boolean is(List list) {
        return list == null || list.size() == 0;
    }

}
