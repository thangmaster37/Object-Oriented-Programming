package homework7.src.Bai1_5;

public class NorthAmericaCountry extends Country
{
    private int population;
    private double area;
    private double gdp;

    public NorthAmericaCountry(String code, String name, int population, double area, double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public String toString() {
        return "NorthAmericaCountry[" +
                "population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ']';
    }
}
