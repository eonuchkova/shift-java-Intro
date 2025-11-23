package homework24;

public class Autobot extends Transformer {

    String teamName;
    final String eyeColor = "blue";
    boolean kindness = true;

    Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    void transform() {
        System.out.println(name + " transforms into vehicle");
    }

    void showProperties() {
        System.out.println("Name: " + name);
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }

}
