import java.util.ArrayList;
import java.util.Date;

public class Hamster extends Pet{

    public Hamster(int id, String name, Date birthday, ArrayList<String> commands) {
        super(id, name, birthday, commands);
    }

    public Hamster(String name, Date birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
}
