public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Priut", "Kojoberdieva2");
        Dog objectA = new Dog("Baron",5,shelter, "pitbul");
        System.out.println(objectA.getInfo());
        objectA.dogSize(15);
        objectA.makeVoice("GAv gav");

        Puppy objectB = new Puppy("Jorik",3,shelter, "ovcharka","milk");
        System.out.println(objectB.getInfo());
        objectB.dogSize(4);
        objectB.makeVoice("gr gr");


        Puppy objectC = new Puppy("Moni",4,shelter,"hatiko","meat" );
        System.out.println(objectC.getInfo());
        objectC.dogSize(6);
        objectC.makeVoice("GAV");
    }
}