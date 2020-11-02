package animalkingdom;

//functional interface, only takes 1 function, we use it as a helper

@FunctionalInterface
public interface AnimalTester {
    boolean test(Animal a);
}