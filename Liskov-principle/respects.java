class Bird{
    public void fly(){
        System.out.println("Bird is flying.");
    }
}

class Crow extends Bird{
    @Override
    public void fly(){
        System.out.println("Crow flies.");
    }
}

class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle Flies.");
    }
}

public class respects{
    public static void letBirdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[] args) {
        letBirdFly(new Crow());
        letBirdFly(new Eagle());

    }
}