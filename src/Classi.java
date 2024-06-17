interface Animal {
    void eat();
    void sound();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Цебцебе.");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Не цебцебе.");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}

interface Pet extends Animal {
    void play();
}

class DogPet extends Dog implements Pet {
    @Override
    public void play() {
        System.out.println("Не цебцебе.");
    }
}

class CatPet extends Cat implements Pet {
    @Override
    public void play() {
        System.out.println("Цебцебе.");
    }
}

public class Classi {
    public static void main(String[] args) {
        DogPet dog = new DogPet();
        CatPet cat = new CatPet();

        dog.eat();
        dog.sound();
        dog.play();

        cat.eat();
        cat.sound();
        cat.play();
    }
}