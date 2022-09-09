public class Main {
    public static void main(String[] args) {
        int Product[] = { 100, 200, 300, 400, 500 };

        SalesManager salesManager = new SalesManager(Product);
        salesManager.max();

        System.out.print("Статистика продаж: ");
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());

        System.out.println(salesManager.middle());
    }
}