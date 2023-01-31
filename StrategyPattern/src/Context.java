// create a Context class that will ask from Strategy
// interface to execute the type of strategy.

public class Context {
    private Strategy strategy;

//    constructor
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
//        perform different operations
        return strategy.doOperation(num1, num2);
    }
}

