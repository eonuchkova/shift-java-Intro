package homework24;

public class Transformer {
    public String name;

    public Transformer(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " is running");
    }

    void fire(){
        System.out.println(name + " is firing");
    }

    void charge() {
        System.out.println(name + " is charging");
    }

}
