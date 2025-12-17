package homework24;

public abstract class Transformer implements Action{
    String name;

    public Transformer(String name) {
        this.name = name;
    }
    abstract void transform();

    @Override
    public String getName() {
        return name;
    }

}
