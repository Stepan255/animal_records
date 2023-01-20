import java.util.ArrayList;
import java.util.Date;

public abstract class PackAnimal extends Animal{

    public PackAnimal(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public PackAnimal(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
}
