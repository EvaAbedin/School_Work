import java.util.*;

interface RuminantTester{
    void testIfRuminant();
    void testHasMultipleStomachs();
}

abstract class Mammal{

    //below function is implemented
    public void nursesYoung(){
        String classname = this.getClass().getName();
        System.out.println("I am a "+ classname + ". I am nursing.");
    }
}

abstract class GrazingMammal extends Mammal implements RuminantTester{

    public void testIfRuminant(){
        String className = this.getClass().getName();
        if(this instanceof Ruminant){
            System.out.println("I am a "+ className + ". I am a Ruminant.");
        }
        else {
            System.out.println("I am a "+ className + ". I am not a Ruminant.");
        }
    }

    public void testHasMultipleStomachs(){
        String className = this.getClass().getName();
        if(this instanceof Ruminant){
            System.out.println("I am a "+ className + ". I have multiple Stomachs.");
        }
        else {
            System.out.println("I am a "+ className + ". I do not have multiple stomachs.");
        }
    }
    boolean grazes(){
        return true;
    }
}

class Ruminant extends GrazingMammal{

    public void nursesYoung(){
        String classname = this.getClass().getName();
        System.out.println("I am a "+ classname + ". I am nursing.");
    }
    boolean chewCud(){
        return true;
    }
}

class Cow extends Ruminant{

}

class Goat extends Ruminant{

}

class Horse extends GrazingMammal{

}

class GrazingMammals{
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.nursesYoung();
        cow.grazes();
        cow.chewCud();
        cow.testIfRuminant();
        cow.testHasMultipleStomachs();
        System.out.println("\n");
        Goat goat = new Goat();
        goat.nursesYoung();
        goat.grazes();
        goat.chewCud();
        goat.testIfRuminant();
        goat.testHasMultipleStomachs();
        System.out.println("\n");
        Horse horse = new Horse();
        horse.nursesYoung();
        horse.grazes();
        horse.testIfRuminant();
        horse.testHasMultipleStomachs();
    }
}