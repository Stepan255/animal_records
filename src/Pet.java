import java.util.ArrayList;
import java.util.Date;

public abstract class Pet extends Animal{

    public Pet(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public Pet(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
}
