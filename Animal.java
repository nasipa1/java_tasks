import java.util.ArrayList;

//import tools.Tool;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Eating..." );
    }

    public void makeSound() {
        System.out.println("Make Sound..." );
    }
}
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("the dog loves chicken bones");
    }

    public void makeSound() {
        System.out.println("sabaka does ARRRRRRR");
    }

}

class Cat extends Animal {
    private boolean hasFur;
    public Cat(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void eat() {
        System.out.println("milk is for a cat");
    }

    public void makeSound() {
        System.out.println("cat does meowmeowmeowmeow");
    }
}

class Animals {
    public static void main(String[] args) {
        Animal animal1 = new Animal("monkey", 3);
        Animal animal2 = new Dog("Aramzamzam", 12, "sabaka");
        Animal animal3 = new Cat("Bars",  99, false);
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal1.eat();
        animal2.eat();
        animal3.eat();

        System.out.println(animal2 instanceof Dog);


//        Tool t = new Tool();
//        t.y = 4;
//        ArrayList<Integer> list = new ArrayList<>();
//        String s = new String();
//


    }
}
//class TTTool extends Tool{
//    public TTTool() {
//        this.x = 3;
//    }
//}


