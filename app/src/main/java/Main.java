import checker.ConditionChecker;
import model.User;

public class Main {

    public static void main(String[] args) {

        User user = null;

        if(ConditionChecker.isNull(user)){
            System.out.println("user object is null");
        }

    }




}
