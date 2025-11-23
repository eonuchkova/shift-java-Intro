package homework24;

public class Decepticon extends Transformer {

    String teamName;
    final String eyeColor = "red";
    boolean kindness = false;

    Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    void transformToWeapon() {
        System.out.println(name + " transforms into a weapon");
    }

    void transformToEquipment() {
        System.out.println(name + " transforms into an equipment");
    }

    void transformToPlane() {
        System.out.println(name + " transforms into a plane");
    }

    void showProperties() {
        System.out.println("Name: " + name);
        System.out.println("Team: " + teamName);
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Kindness: " + kindness);
    }

}


