class Bird{
    public void fly(){
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}


public class notrespects {
    public static void letBirdFly(Bird bird)    {
        bird.fly();
    }

    public static void main(String[] args) {
        letBirdFly(new Ostrich());
    }
}
