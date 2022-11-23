public final class Puppy extends Dog {
    private String eat;
    private Shelter shelter;

    public String getEat() {
        return eat;
    }


    public Puppy(String name, int age,Shelter shelter, String breed, String eat) {
        super(name, age, shelter,breed);
        this.eat = eat;
        this.shelter = shelter;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nEat: " + eat + getEat()+
                "\nShelter name:" + shelter.getName()+
                "\nShelter address:" + shelter.getAddress();
    }
}