package homework24;

public interface Action  {

    String getName();

    default void run () {
        System.out.println(getName() + " is running");
    }

    void fire();

    void charge();


}
