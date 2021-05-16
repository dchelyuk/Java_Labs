package Lab7;

public class Main {
    public static void main(String[] args) {
        Drug drug1 = new Drug("Ibuprofen", 100, 300, "Ibuprom",
                3, 10, 10.00);
        Drug drug2 = new Drug("Nurofen", 20, 200, "Nurom",
                20, 20, 15.00);
        Drug drug3 = new Drug("Validol", 50, 400, "Validol",
                10, 5, 7.50);
        System.out.println(drug1.pill_price);
        System.out.println(drug2.pill_price);
        System.out.println(drug3.pill_price);
    }
}
