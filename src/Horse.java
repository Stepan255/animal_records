import java.util.ArrayList;
import java.util.Date;

public class Horse extends PackAnimal{

    public Horse(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public Horse(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
}
