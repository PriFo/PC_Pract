package pract16;

public class OrderAlreadyAdd extends Exception {
    public OrderAlreadyAdd() {
        super("Заказ уже добавлен");
    }
}
