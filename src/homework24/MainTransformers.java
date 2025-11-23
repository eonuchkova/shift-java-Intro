package homework24;

public class MainTransformers {
    public static void main(String[] args) {  // точка входа main
        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        System.out.println( "New transformer" + "is created");

        bumblebee.showProperties();
        bumblebee.run();
        bumblebee.fire();
        bumblebee.charge();
        bumblebee.transform();

        System.out.println( "\n" + "***" + "\n" );

        Decepticon megatron = new Decepticon("Megatron", "Decepticons");
        System.out.println( "New transformer is created");

        megatron.showProperties();
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transformToEquipment();
        megatron.transformToWeapon();
        megatron.transformToPlane();

    }
}
