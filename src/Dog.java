public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void dogSize(int size) {
        System.out.println("Size: " + size);
    }

    public Dog(String name, int age, Shelter shelter, String breed) {
        super(name, age, shelter);
        this.breed = breed;
    }

    public void makeVoice(String voice){
        System.out.println("Voice:" + voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nBreed: " + breed;
    }
}