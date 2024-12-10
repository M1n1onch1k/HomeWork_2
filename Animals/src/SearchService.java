public interface SearchService {

    /**
     * Находит имена животных, родившихся в високосный год.
     * @param animals массив животных
     * @return массив имен животных
     */
    String[] findLeapYearNames(Animal[] animals);

    /**
     * Находит всех животных старше N лет.
     * @param animals массив животных
     * @param N возраст
     * @return массив животных старше N лет
     */
    Animal[] findOlderAnimals(Animal[] animals, int N);

    /**
     * Выводит дубликаты животных.
     * @param animals массив животных
     */
    void findDuplicate(Animal[] animals);
}
