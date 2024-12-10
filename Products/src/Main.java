
public class Main {
    public static void main(String[] args) {
        // Создаем объекты Product с различными параметрами
        Product product1 = new Product(5, 100.0, 0.75);
        Product product2 = new Product(3, 250.5, 42.575);
        Product product3 = new Product(10, 50.0, 59.1);

        // Вызываем метод для подсчета и вывода сумм для каждого продукта
        printPurchaseSummary(product1);
        printPurchaseSummary(product2);
        printPurchaseSummary(product3);
    }

    /**
     * Метод для вывода итоговой суммы покупки без и со скидкой.
     *
     * @param product Объект товара
     */
    public static void printPurchaseSummary(Product product) {
        double totalWithoutDiscount = product.calculateTotalWithoutDiscount();
        double totalWithDiscount = product.calculateTotalWithDiscount();

        System.out.printf("Общая сумма покупки без скидки: %.2f%n", totalWithoutDiscount);
        System.out.printf("Общая сумма покупки со скидкой: %.2f%n", totalWithDiscount);
        System.out.println();
    }
}
