public class Animal {
    private String name;
    private int age;
    private Shelter shelter;

    public Animal(String name, int age, Shelter shelter) {
        this.name = name;
        this.age = age;
        this.shelter = shelter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public String getInfo() {
        return "\nName: " + name + "\nAge: " + age;
    }
}