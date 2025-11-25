package homework24;

public class Autobot extends Transformer implements Action {

    String teamName;
    final String eyeColor = "blue";
    boolean kindness = true;

    Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    void showProperties() {
        System.out.println("Name: " + name);
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }


    @Override
    public void fire() {
        System.out.println(name + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging");
    }

    @Override
    void transform() {
        System.out.println(name + " is transforming into vehicle");
    }

}
