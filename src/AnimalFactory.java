import java.util.ArrayList;
import java.util.Date;

public class AnimalFactory {
    public static Animal createAnimal(String type, String name, Date birthday, ArrayList<String> commands){
        return switch (type) {
            case "cat" -> new Cat(name, birthday, commands);
            case "dog" -> new Dog(name, birthday, commands);
            case "hamster" -> new Hamster(name, birthday, commands);
            case "horse" -> new Horse(name, birthday, commands);
            default -> Animal.nullAnimal();
        };
    }
}
