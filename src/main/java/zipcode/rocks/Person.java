package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favBev;
    private String favColor;
    private boolean hasPets;

    public Person(String value, String value1) {
    }

    public String getFavBev() {
        return favBev;
    }

    public void setFavBev(String favBev) {
        this.favBev = favBev;
    }

    public String getFavColor(String red) {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public boolean isHasPets(boolean hasPets) {
        return hasPets;
    }

    public void setHasPets(boolean hasPets) {
        this.hasPets = hasPets;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String fname) {
        this.firstname = fname;
    }

    public Person(String firstname, String favBev, String favColor, boolean hasPets) {
        this.firstname = firstname;
        this.favBev = favBev;
        this.favColor = favColor;
        this.hasPets = hasPets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\''+
                ", favBev='" + favBev + '\'' +
                ", favColor='" + favColor + '\'' +
                ", hasPets=" + hasPets +
                '}';
    }
}
