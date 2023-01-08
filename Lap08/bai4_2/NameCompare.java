package bai4_2;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie>
{
    public int compare(Movie left, Movie right)
    {
        return Integer.compare(left.getYear(), right.getYear());
    }
}
