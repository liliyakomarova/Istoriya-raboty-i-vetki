public class Main {
    public static void main(String[] args) {
        int Product[] = {10, 20, 30, 40, 50};
        SalesManager salesManager = new SalesManager(Product);
        salesManager.max();

        System.out.print("Статистика продаж: ");
        System.out.println(salesManager.max());
    }
}