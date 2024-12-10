import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalService {

    private final Random random = new Random();

    public List<Animal> createDefaultAnimals() {
        List<Animal> animals = new ArrayList<>();

        for (int count = 0; count < 10; count++) {
            animals.add(createAnimal(count));
        }

        return animals;
    }

    public Animal createAnimal(int id) {
        LocalDate birthDate = generateRandomBirthDate();
        return new Dog("Breed" + id, "Dog" + id, 100.0 + id, "Friendly", birthDate);
    }

    private LocalDate generateRandomBirthDate() {
        int year = random.nextInt(20) + 2000; // Генерация годов от 2000 до 2019
        int dayOfYear = random.nextInt(365) + 1; // Генерация дня года
        return LocalDate.ofYearDay(year, dayOfYear);
    }
}

