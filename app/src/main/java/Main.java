import checker.ConditionChecker;
import model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = null;

        if (ConditionChecker.isNull(user)) {
            System.out.println("user object is null");
        }

        List<User> users =null;

        if(ConditionChecker.isEmptyList(users)){
            System.out.println("user list is empty");
        }


    }


}
