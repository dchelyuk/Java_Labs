package Lab7;

public class Drug {
    static int releaseYear = 2021;

    private String name;
    int volumeOfOperativeSubstance;
    int weightInMg;
    protected String operativeSubstanceName;
    protected int maxDosesPerDay;
    private double durationInHours;
    private int countInPackage;
    private double packagePrice;
    private double pillPrice;

    Drug() {
    }

    Drug(String name, double durationInHours, int countInPackage, double packagePrice) {
        this.setName(name);
        this.setDurationInHours(durationInHours);
        this.setCountInPackage(countInPackage);
        this.setPackagePrice(packagePrice);
        this.setPillPrice();
    }

    Drug(String name, int volumeOfOperativeSubstance, int weightInMg, String operativeSubstanceName,
         int maxDosesPerDay, double durationInHours, int countInPackage, double packagePrice) {
        this(name, durationInHours, countInPackage, packagePrice);
        this.volumeOfOperativeSubstance = volumeOfOperativeSubstance;
        this.weightInMg = weightInMg;
        this.operativeSubstanceName = operativeSubstanceName;
        this.maxDosesPerDay = maxDosesPerDay;
    }

    public static void printStaticReleaseYear() {
        System.out.println("Release year: " + Drug.releaseYear + "\n");
    }

    public void printReleaseYear() {
        System.out.println("Release year: " + Drug.releaseYear + "\n");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationInHours() {
        return this.durationInHours;
    }

    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    public int getCountInPackage() {
        return this.countInPackage;
    }

    public void setCountInPackage(int countInPackage) {
        this.countInPackage = countInPackage;
        this.setPillPrice();
    }

    public double getPackagePrice() {
        return this.packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
        this.setPillPrice();
    }

    public double getPillPrice() {
        return this.pillPrice;
    }

    public void setPillPrice() {
        this.pillPrice = this.packagePrice / this.countInPackage;
    }

    public void resetValues(String name, int volumeOfOperativeSubstance, int weightInMg, String operativeSubstanceName,
                            int maxDosesPerDay, double durationInHours, int countInPackage, double packagePrice) {
        this.setName(name);
        this.volumeOfOperativeSubstance = volumeOfOperativeSubstance;
        this.weightInMg = weightInMg;
        this.operativeSubstanceName = operativeSubstanceName;
        this.maxDosesPerDay = maxDosesPerDay;
        this.setDurationInHours(durationInHours);
        this.setCountInPackage(countInPackage);
        this.setPackagePrice(packagePrice);
        this.setPillPrice();
    }

    @Override
    public String toString() {
        return "Release Year: " + Drug.releaseYear + "\nName: " + this.name
                + "\nVolume of operative substance: " + this.volumeOfOperativeSubstance
                + "\nWeight in mg: " + this.weightInMg + "\nActive substance name: " + this.operativeSubstanceName
                + "\nMaximum doses per day: " + this.maxDosesPerDay
                + "\nDrug duration in hours: " + this.durationInHours + "\nCount in package: " + this.countInPackage
                + "\nPackage price: " + packagePrice + "\nPrice for 1 pill: " + this.pillPrice
                + "\n-------------------------------\n";
    }
}
