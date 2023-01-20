import java.util.ArrayList;
import java.util.Date;

public class Cat extends Pet{

    public Cat(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public Cat(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }

}
