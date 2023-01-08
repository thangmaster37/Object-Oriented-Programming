package homework7.src.Bai1_5;
import java.util.Arrays;
public class CountryArrayManager
{
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int minInd = i;
            for (int k = i; k < newArray.length; k++) {
                if (newArray[k].getPopulation() < newArray[minInd].getPopulation()) {
                    minInd = k;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minInd];
            newArray[minInd] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */

    public Country[] sortByDecreasingPopulation(){
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxInd = i;
            for (int k = i; k < newArray.length; k++){
                if (newArray[k].getPopulation() > newArray[maxInd].getPopulation()) {
                    maxInd = k;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxInd];
            newArray[maxInd] = temp;

        }
        return newArray;
    }


    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++)
        {
            for (int k = 0; k < newArray.length - 1; k++)
            {
                if (newArray[k].getArea() > newArray[k + 1].getArea())
                {
                    Country temp = newArray[k];
                    newArray[k] = newArray[k + 1];
                    newArray[k + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++)
        {
            for (int k = 0; k < newArray.length - 1; k++)
            {
                if (newArray[k].getArea() < newArray[k + 1].getArea())
                {
                    Country temp = newArray[k];
                    newArray[k] = newArray[k + 1];
                    newArray[k + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++)
        {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp())
            {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 1; i < newArray.length; i++)
        {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp())
            {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }
            newArray[j + 1] = key;
        }


        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] newArray = new AfricaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("AfricaCountry")){
                    newArray[idx] = new AfricaCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                    idx += 1;
                }
            }
        }
        return newArray;

    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] newArray = new AsiaCountry[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("AsiaCountry")){
                    newArray[idx] = new AsiaCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] newArray = new EuropeCountry[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("EuropeCountry")){
                    newArray[idx] = new EuropeCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public NorthAmericaCountry filterNorthAmericaCountry() {
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("NorthAmericaCountry")){
                    remove(i);
                    return new NorthAmericaCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                }
            }
        }
        return null;
    }

    public OceaniaCountry filterOceaniaCountry() {
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("OceaniaCountry")){
                    remove(i);
                    return new OceaniaCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                }
            }
        }
        return null;
    }

    public SouthAmericaCountry filterSouthAmericaCountry() {
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                String[] array = countries[i].getClass().getName().split("\\.");
                if (array[array.length - 1].equals("SouthAmericaCountry")){
                    remove(i);
                    return new SouthAmericaCountry(countries[i].getCode(), countries[i].getName(), countries[i].getPopulation(), countries[i].getArea(), countries[i].getGdp());
                }
            }
        }
        return null;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getPopulation() > howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getPopulation() < howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getArea() > howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getArea() < howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getGdp() > howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newArray = new Country[this.length];
        int idx = 0;
        for (int i = 0; i < countries.length; i++){
            if (countries[i] != null){
                if (countries[i].getGdp() < howMany){
                    newArray[idx] = countries[i];
                    idx += 1;
                }
            }
        }
        return newArray;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
