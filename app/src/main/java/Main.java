import function.Func;
import function.Monad;
import model.User;

public class Main {

    public static void main(String[] args) {

        User user = new User("gokhan", "alıcı");

        Monad.just(user).map(new Func<User, Monad<String>>() {
            @Override
            public Monad<String> to(User user) {
                return Monad.just(user.getName());
            }
        }).get();

    }


}
