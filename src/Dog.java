import java.util.ArrayList;
import java.util.Date;

public class Dog extends Pet{

    public Dog(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public Dog(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
}
