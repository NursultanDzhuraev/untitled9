//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Russia","rus",122,"rus");
        Country country2 = new Country("Kyrgyz","kyrgyz",444,"kyryz");
        Country country3 = new Country("kaz","kaz",231,"kaz");
        Country countryMaxWihtArea = Country.getMaxArea(new Country[]{country1, country2, country3});
        System.out.println(countryMaxWihtArea);
    }
}