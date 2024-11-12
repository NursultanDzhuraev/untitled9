public class Country {
    private String name;
    private String peaple;
    private long square;
    private String lang;

    public Country(String name, String peaple, long square, String lang) {
        this.name = name;
        this.peaple = peaple;
        this.square = square;
        this.lang = lang;



    }
    public static Country getMaxArea(Country[] countries) {
        if (countries == null || countries.length== 0) return  null;

        Country maxAreaCountry = countries[0];
        for (Country country : countries) {
            if (maxAreaCountry.square < country.square)
                maxAreaCountry = country;


        }
        return maxAreaCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peaple='" + peaple + '\'' +
                ", square=" + square +
                ", lang='" + lang + '\'' +
                '}';
    }
}
