package march16;

public class ObjectDemo {
    String name;
    String place;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
