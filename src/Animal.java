import java.util.Date;
import java.util.ArrayList;

public abstract class Animal {
    protected int id;
    protected String name;
    protected Date birthday;
    protected ArrayList<String> commands;

    public Animal(int id, String name, Date birthday, ArrayList<String> commands) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public Animal(String name, Date birthday, ArrayList<String> commands) {
        this(IdGenerator.getId(), name, birthday, commands);
    }

    public static Animal nullAnimal(){
        return new Cat(0,"", new Date(0, 0, 0), new ArrayList<>());
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

//    public String getCommandsToString() {
//        String text = "";
//        for (String command:
//             this.commands) {
//            text += "," + command;
//        }
//        return text;
//    }

    public void addCommands(String command) {
        this.commands.add(command);
    }

    @Override
    public String toString() {
        return "[" + this.id + "; " + this.name + "; "
                + DateHandler.getDateToString(this.birthday) + "; " + this.commands.toString() + "]";
    }
}
