package Lab7;

public class Drug {
    int release_year = 2021;

    String name;
    int volume_of_active_substance;
    int weight_in_mg;
    String active_substance_name;
    int max_doses_per_day;
    double duration;
    int count_in_package;
    double package_price;
    double pill_price;

    Drug() {}

    Drug(String name, double duration, int count_in_package, double package_price) {
        this.name = name;
        this.duration = duration;
        this.count_in_package = count_in_package;
        this.package_price = package_price;
        this.pill_price = package_price / count_in_package;
    }

    Drug(String name, int volume_of_active_substance, int weight_in_mg, String active_substance_name,
         int max_doses_per_day, double duration, int count_in_package, double package_price) {
        this(name, duration, count_in_package, package_price);
        this.volume_of_active_substance = volume_of_active_substance;
        this.weight_in_mg = weight_in_mg;
        this.active_substance_name = active_substance_name;
        this.max_doses_per_day = max_doses_per_day;
    }

    public String toString() {
        return "Release Year: " + this.release_year + "\nName: " + this.name
                + "\nVolume of active substance: " + this.volume_of_active_substance
                + "\nWeight in mg: " + this.weight_in_mg
                + "\nActive substance name: " + this.active_substance_name
                + "\nMaximum doses per day: " + this.max_doses_per_day
                + "\nDrug duration: " + this.duration + "\nCount in package: " + this.count_in_package
                + "\nPackage price: " + package_price + "\nPrice for 1 pill: " + this.pill_price
                + "\n--------------------------------\n";
    }
}
