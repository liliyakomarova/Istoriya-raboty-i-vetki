public class Main {
    public static void main(String[] args) {
        long Product[] = {10, 20, 30, 40, 50};
        SalesManager salesManager = new SalesManager(Product);
        salesManager.max();

        System.out.print("Статистика продаж: ");
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());

        System.out.println(salesManager.middle());
    }
}