package Person;

import java.util.Objects;

public class Passport {
    String Series;

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    public Passport(String series, int number) {
        Series = series;
        this.number = number;
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Passport passport = (Passport)o;
        return number == passport.number && Objects.equals(Series, passport.Series);
    }

    @Override public int hashCode() {

        return Objects.hash(Series, number);
    }
}
