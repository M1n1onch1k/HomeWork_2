import java.time.LocalDate;

public class Dog extends AbstractAnimal {

    public Dog(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

