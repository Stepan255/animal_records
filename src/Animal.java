import java.util.Date;
import java.util.ArrayList;

public class Animal {
    protected int id;
    protected String name;
    protected Date birthday;
    protected ArrayList<String> commands;

    public Animal(String name, Date birthday, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public static Animal nullAnimal(){
        return new Animal("", new Date(0, 0, 0), new ArrayList<>());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void addCommands(String command) {
        this.commands.add(command);
    }
}
