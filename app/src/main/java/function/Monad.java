package function;

public class Monad<T> {

    private T t;

    private Monad(T t) {
        this.t = t;
    }

    public static <T> Monad<T> just(T t) {
        return new Monad<>(t);
    }

    public <R> Monad<R> map(Func<T, Monad<R>> func) {
        return func.to(t);
    }

    public T getT() {
        return t;
    }
}
