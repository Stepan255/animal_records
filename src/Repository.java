import java.util.ArrayList;

public class Repository {
    protected ArrayList<Animal> animals;
    protected ArrayList<Animal> yongAnimals;

    public Repository(ArrayList<Animal> animals, ArrayList<Animal> yongAnimals) {
        this.animals = animals;
        this.yongAnimals = yongAnimals;
    }

    public Animal findAnimal(int id){
        for (Animal animal:
             animals) {
            if (animal.getId() == id){
                return animal;
            }
        }
        return Animal.nullAnimal();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public ArrayList<Animal> getYongAnimals() {
        return yongAnimals;
    }

    public void setYongAnimals(ArrayList<Animal> yongAnimals) {
        this.yongAnimals = yongAnimals;
    }

    public void setYongAnimal(Animal yongAnimal) {
        this.yongAnimals.add(yongAnimal);
    }
}
