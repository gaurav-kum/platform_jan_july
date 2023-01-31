public interface Strategy {
    public int doOperation(int num1, int num2);
}

// Any actual sort algorithm is an implementation of Strategy,
// and needs to override doOperation() method.