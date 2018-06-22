package Person;

import java.util.Objects;

public class Passport {
    String series;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    public Passport(String series, int number) {
        this.series = series;
        this.number = number;
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Passport passport = (Passport)o;
        return number == passport.number && Objects.equals(series, passport.series);
    }

    @Override public int hashCode() {

        return Objects.hash(series, number);
    }
}
