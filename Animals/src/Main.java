import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        List<Animal> defaultAnimals = createAnimalService.createDefaultAnimals();

        // Преобразуем список в массив для передачи в SearchService
        Animal[] animalArray = defaultAnimals.toArray(new Animal[0]);

        SearchService searchService = new SearchServiceImpl();

        // Поиск имен животных, родившихся в високосный год
        String[] leapYearNames = searchService.findLeapYearNames(animalArray);
        System.out.println("Животные, родившиеся в високосный год: " + String.join(", ", leapYearNames));

        // Поиск животных старше N лет
        int N = 5; // Например, старше 5 лет
        Animal[] olderAnimals = searchService.findOlderAnimals(animalArray, N);
        System.out.println("Животные старше " + N + " лет:");
        for (Animal animal : olderAnimals) {
            System.out.println(animal.getName());
        }

        // Поиск дубликатов
        searchService.findDuplicate(animalArray);
    }
}
