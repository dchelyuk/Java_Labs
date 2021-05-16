package Lab7;

public class Main {
    public static void main(String[] args) {
        Drug drug1 = new Drug("Ibuprofen", 100, 300, "Ibuprom",
                3, 2.5, 10, 10.00);
        Drug drug2 = new Drug("Nurofen", 20, 200, "Nurom",
                20, 5, 20, 15.00);
        Drug drug3 = new Drug("Validol", 50, 400, "Validol",
                10, 24, 5, 7.50);
        System.out.println(drug1);
        System.out.println(drug2);
        System.out.println(drug3);

        Drug.printStaticReleaseYear();

        drug1.setCountInPackage(11);
        System.out.println(drug1.getCountInPackage());

        drug2.setName("Nurofen2");
        System.out.println(drug2.getName());

        drug3.setDurationInHours(12.5);
        System.out.println(drug3.getDurationInHours());

        drug1.setPackagePrice(7.50);
        System.out.println(drug1.getPackagePrice());
        System.out.println(drug1.getPillPrice());

    }
}
