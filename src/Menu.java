import java.util.ArrayList;

public class Menu {

    Repository r = new Repository(new ArrayList<>(), new ArrayList<>());
    ConsoleReader cr = new ConsoleReader();

    public void start(){
        while (true){
            mainMenu();
            String value = cr.getLine();
            int hashValue = value.hashCode();

            if (hashValue == "1".hashCode()){
                startCreateAnimal();
            } else if (hashValue == "2".hashCode()) {
                getAnimals();
            } else if (hashValue == "3".hashCode()) {
                findAnimals();}
            else if (hashValue == "0".hashCode()) {
                cr.stop();
                break;
            }
        }
    }

    private void findAnimals() {
        System.out.println("Input id animal");
        String value = cr.getLine();
        if (isNumeric(value)){
            if (Double.parseDouble(value) < 2147483647){
                Animal animal = r.findAnimal(Integer.parseInt(value));
                changeAnimal(animal);
            }
        }
    }

    private void changeAnimal(Animal animal) {
        System.out.println("1 - Add an animal command");
        System.out.println("2 - Show all animal command");
        System.out.println("3 - Add animal command");
        System.out.println("0 - Main menu");
        String value = cr.getLine();
        int hashValue = value.hashCode();
        if (hashValue == "1".hashCode()){
            startCreateAnimal();
        } else if (hashValue == "2".hashCode()) {
            getAnimals();
        } else if (hashValue == "3".hashCode()) {
            findAnimals();}
        else if (hashValue == "0".hashCode()) {
            start();
        }

    }

    public void getAnimals(){
        System.out.println("All animal");
        for (Animal animal :
                r.getAnimals()) {
            System.out.println(animal);
        }
    }

    public void startCreateAnimal(){
        System.out.println("Enter animal name:");
        String name = cr.getLine();
        System.out.println("Date of birth of the animal in the format 'yyyy-MM-dd' :");
        String birthday = cr.getLine();
        createAnimal(name, birthday);
    }

    public void createAnimal(String name, String birthday){
        while (true){
            System.out.println("Enter the type of animal:\n1-cat\n2-dog\n3-hamster\n4-horse\n5-to main menu");
            String value = cr.getLine();
            int hashValue = value.hashCode();
            if (hashValue == "1".hashCode()){
                endCreateAnima("cat", name, birthday);
                break;
            } else if (hashValue == "2".hashCode()) {
                endCreateAnima("dog", name, birthday);
                break;
            } else if (hashValue == "3".hashCode()) {
                endCreateAnima("hamster", name, birthday);
                break;
            } else if (hashValue == "4".hashCode()) {
                endCreateAnima("horse", name, birthday);
                break;
            } else if (hashValue == "5".hashCode()) {
                start();
                break;
            }
        }
    }

    public void endCreateAnima(String type, String name, String birthday){
        Animal animal = AnimalFactory.createAnimal(type, name, DateHandler.getDate(birthday), new ArrayList<>());
        System.out.println("Received animal:");
        System.out.println(animal);
        System.out.println("Want to save y/n?");
        String value = cr.getLine();
        int hashValue = value.hashCode();
        if (hashValue == "y".hashCode()){
            r.setAnimal(animal);
            System.out.println("Save successful");
            new CounterController().add();
        }
        start();
    }

    private void mainMenu(){
        System.out.println("Select a menu item by entering the desired number:");
        System.out.println("1 - Add an animal");
        System.out.println("2 - All an animal");
        System.out.println("3 - Find an animal");
        System.out.println("0 - Exit");
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d{10}");
    }
}
