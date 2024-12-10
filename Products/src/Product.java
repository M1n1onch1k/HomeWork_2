/**
 * Класс Product представляет товар с определенными параметрами,
 * включая количество, цену и скидку.
 */
public class Product {
    // Количество товаров
    private int quantity;

    // Цена товара
    private double price;

    // Скидка на товар в процентах
    private double discount;

    /**
     * Конструктор класса Product.
     *
     * @param quantity Количество товаров
     * @param price Цена товара
     * @param discount Скидка на товар
     */
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    // Геттер для количества товаров
    public int getQuantity() {
        return quantity;
    }

    // Геттер для цены товара
    public double getPrice() {
        return price;
    }

    // Геттер для скидки на товар
    public double getDiscount() {
        return discount;
    }

    /**
     * Метод для расчета общей суммы покупки без скидки.
     *
     * @return Общая сумма покупки без скидки
     */
    public double calculateTotalWithoutDiscount() {
        return quantity * price;
    }

    /**
     * Метод для расчета общей суммы покупки со скидкой.
     *
     * @return Общая сумма покупки со скидкой
     */
    public double calculateTotalWithDiscount() {
        double totalWithoutDiscount = calculateTotalWithoutDiscount();
        return totalWithoutDiscount - (totalWithoutDiscount * discount / 100);
    }
}
