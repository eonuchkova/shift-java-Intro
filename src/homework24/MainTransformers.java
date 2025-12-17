package homework24;

import java.util.ArrayList;
import java.util.List;

public class MainTransformers {
    public static void main(String[] args) {  // точка входа main

        Autobot bumblebee = new Autobot("Bumblebee", "Autobots");
        System.out.println( "New transformer is created");

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
        megatron.transform();

        List<String> transformersList = new ArrayList<>();
        transformersList.add("Bumblebee");
        transformersList.add("Megatron");
        System.out.println( "\n" + "***" + "\n" );
        System.out.println("List of transformers:" + "\n"+ transformersList);
    }
}
