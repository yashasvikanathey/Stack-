import pkg_Stack.FixedStorageStack;
import pkg_Stack.GrowableStorageStack;

public class Main {
    public static void main(String[] args) {
        FixedStorageStack fixedStack = new FixedStorageStack(3);
        fixedStack.push(1);
        fixedStack.push(2);
    }
}
