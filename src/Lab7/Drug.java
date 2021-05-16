package Lab7;

public class Drug {
    String type = "pill";

    String name;
    int volume_of_active_substance;
    int weight_in_mg;
    String active_substance_name;
    int max_doses_per_day;
    int count_in_package;
    double package_price;
    double pill_price;

    Drug(String name, int volume_of_active_substance, int weight_in_mg, String active_substance_name,
         int max_doses_per_day, int count_in_package, double package_price) {
        this.name = name;
        this.volume_of_active_substance = volume_of_active_substance;
        this.weight_in_mg = weight_in_mg;
        this.active_substance_name = active_substance_name;
        this.max_doses_per_day = max_doses_per_day;
        this.count_in_package = count_in_package;
        this.package_price = package_price;
        this.pill_price = package_price / count_in_package;

    }
}
