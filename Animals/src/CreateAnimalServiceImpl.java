import java.util.ArrayList;
import java.util.List;

public class CreateAnimalServiceImpl extends CreateAnimalService {

    public List<Animal> createNAnimals(int N) {
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            animals.add(createAnimal(i));
            System.out.println("Создано животное: " + animals.get(i).getName());
        }

        return animals;
    }

    public List<Animal> createAnimalsWithDoWhile(int N) {
        List<Animal> animals = new ArrayList<>();
        int count = 0;

        do {
            animals.add(createAnimal(count));
            System.out.println("Создано животное: " + animals.get(count).getName());
            count++;
        } while (count < N);

        return animals;
    }
}

