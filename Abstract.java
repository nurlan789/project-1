package UdemyLesson8;

public class Abstract {
}

abstract class Animal{
    protected void eat(){
        System.out.println("Animal eats");
    };
    protected abstract String name();
    protected abstract void sleep();
}

abstract class Lion extends Animal{
    public String name(){
        return "Waine";
    }
    public abstract void roar();
}

interface CanRun{
    int month(int month);   // public abstract are not required
    public default boolean fly(){
        return false;
    }
}

class Cub extends Lion implements CanRun{
    public void sleep(){
        System.out.println("WalrusChild sleeps");
    }
    public void roar(){
        System.out.println("Just for fun");
    }
    public int month(int month){
        return month;
    }
    public boolean fly(){
        return true;
    }

    public static void main(String[] args) {
        Animal animal = new Cub();
        Lion lion = new Cub();
        Cub cub = new Cub();
        CanRun cub2=new Cub();
        System.out.println(cub.name());
        cub.sleep();
        cub.eat();
        cub.roar();
        System.out.println(cub.fly());
        System.out.println(cub.month(6));

        System.out.println(lion.name());
        lion.sleep();
        lion.eat();
        lion.roar();

        System.out.println(animal.name());
        animal.sleep();
        animal.eat();
    }
}

