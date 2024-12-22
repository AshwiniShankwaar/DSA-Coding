package javaRevision.CollectionFrameWork;

public class Emp implements Comparable<Emp>{
    String name;
    String description;

    public Emp() {
    }

    public Emp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        return this.name.toLowerCase().compareToIgnoreCase(o.name.toLowerCase());
    }
}
