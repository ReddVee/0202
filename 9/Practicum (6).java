public class Practicum {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();
        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}
abstract  class Pet {
    private String voice;
    public int getPawsCount() {
        return pawsCount;
    }
    private int pawsCount;
    public void sleep(){
        System.out.println("Сплю");
    }
    public void play(){
        System.out.println("Играю");
    }
    Pet(String voice, int pawsCount){
    this.voice = voice;
    this.pawsCount = pawsCount;
    }
    public void giveVoice(){
        System.out.println(voice);
    }
}

 class Fish extends Pet {
     public Fish() {
         super("Хрю3",1);
     }
 }

 class Spider extends Pet {
     public Spider() {
         super("Хрю",8);
     }
 }

 class Dog extends Pet {
     public Dog() {
         super("Хрю4",4);
     }
     public void bringStick(){
         System.out.println("Принёс палочку, как хороший мальчик!");
     }
 }

 class Cat extends Pet {
     public Cat() {
         super("Хрю5",4);
     }
     public void catchMouse(){
         System.out.println("Поймала мышку!");
     }

 }

 class Hamster extends Pet {
     public Hamster() {
         super("Хрю6",4);
     }
     public void hideFood(){
         System.out.println("Вся еда — в щёчках!");
     }
 }