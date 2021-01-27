package tools;

public abstract class CustomListener {

    String name;

    public CustomListener(String name) {
        this.name = name;
    }

    public abstract void listen(CustomEvent e, Object... args);

}
