package homework7.src.Bai1_5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class App
{
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        Country[] countries = countryManager.getCountries();
        countryManager.print(countries);

        System.out.println("\n");
        testOriginalData();

        System.out.println("\n");
        testSortIncreasingByPopulation();

        System.out.println("\n");
        testSortDecreasingByPopulation();

        System.out.println("\n");
        testSortIncreasingByArea();

        System.out.println("\n");
        testSortDecreasingByArea();

        System.out.println("\n");
        testSortIncreasingByGdp();

        System.out.println("\n");
        testSortDecreasingByGdp();

        System.out.println("\n");
        testFilterAfricaCountry();

        System.out.println("\n");
        testFilterAsiaCountry();

        System.out.println("\n");
        testFilterEuropeCountry();

        System.out.println("\n");
        testFilterNorthAmericaCountry();

        System.out.println("\n");
        testFilterSouthAmericaCountry();

        System.out.println("\n");
        testFilterOceaniaCountry();

        System.out.println("\n");
        testFilterMostPopulousCountries();

        System.out.println("\n");
        testFilterLeastPopulousCountries();

        System.out.println("\n");
        testFilterLargestAreaCountries();

        System.out.println("\n");
        testFilterSmallestAreaCountries();

        System.out.println("\n");
        testFilterHighestGdpCountries();

        System.out.println("\n");
        testFilterLowestGdpCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            int count = 0;
            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(5).equals("Asia")){
                    AsiaCountry country = new AsiaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }

                else if (dataList.get(5).equals("Oceania")) {
                    OceaniaCountry country = new OceaniaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }

                else if (dataList.get(5).equals("Europe")) {
                    EuropeCountry country = new EuropeCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }

                else if (dataList.get(5).equals("Africa")) {
                    AfricaCountry country = new AfricaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }

                else if (dataList.get(5).equals("North America")) {
                    NorthAmericaCountry country = new NorthAmericaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }

                else if (dataList.get(5).equals("South America")) {
                    SouthAmericaCountry country = new SouthAmericaCountry(dataList.get(0), dataList.get(1), Integer.parseInt(dataList.get(2)), Double.parseDouble(dataList.get(3)), Double.parseDouble(dataList.get(4)));
                    countryManager.append(country);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "F:\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.getCountries();
        for (int i = 0; i < countries.length; i++){
            NorthAmericaCountry north = countryManager.filterNorthAmericaCountry();
            if (north != null){
                System.out.println(north);
            }
        }
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.getCountries();
        for (int i = 0; i < countries.length; i++){
            OceaniaCountry ocean = countryManager.filterOceaniaCountry();
            if (ocean != null){
                System.out.println(ocean);
            }
        }
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.getCountries();
        for (int i = 0; i < countries.length; i++){
            SouthAmericaCountry south = countryManager.filterSouthAmericaCountry();
            if (south != null){
                System.out.println(south);
            }
        }
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(150000000);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(5000000);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(9000000);
        CountryArrayManager.print(countries);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(40000);
        CountryArrayManager.print(countries);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(50000);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(10000);
        CountryArrayManager.print(countries);
    }
}
