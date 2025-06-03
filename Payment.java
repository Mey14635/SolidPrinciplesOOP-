//An example of a good code implemeting The OpenClosed Principle 
interface Payment {
    void process();
}

// New payment type: cash
class CashPayment implements Payment {
    public void process() {
        System.out.println("Processing cash payment");
    }
}

// New payment type: online
class OnlinePayment implements Payment {
    public void process() {
        System.out.println("Processing online payment");
    }
}

// The Checkout class uses the abstraction (interface)
class Checkout {
    public void completeOrder(Payment payment) {
        payment.process(); // works with any Payment implementation
    }
}
//A example of a code without the The OpenClosed Principle 

class PaymentProcessor {
    public void pay(String method) {
        switch (method) {
            case "cash":
                System.out.println("Paying with cash");
                break;
            case "online":
                System.out.println("Paying online");
                break;
            default:
                System.out.println("Unsupported payment method");
        }
        // Each new payment method forces us to modify this method
    }
} else if (method.equals("online")) {
            System.out.println("Paying online");
        }
        // Adding a new method like "bank" means modifying this method
    }
}
//if you want to add a new payment method (e.g., "bank"), you must modify the pay method and add a new case.
//This breaks the OCP because you are changing existing, working code.
