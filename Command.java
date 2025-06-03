//Good example
interface Command {
    void execute();
}

class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}

public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();
        remote.submit(lightOn);
        remote.submit(lightOff);
    }
}

//Bad example 
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class RemoteControl {
    private Light light = new Light();

    public void pressButton(String action) {
        if (action.equals("ON")) {
            light.turnOn();
        } else if (action.equals("OFF")) {
            light.turnOff();
        } else {
            System.out.println("Invalid action");
        }
    }
}

public class BadCommandExample {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.pressButton("ON");
        remote.pressButton("OFF");
    }
}

