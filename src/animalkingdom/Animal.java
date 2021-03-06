package animalkingdom;

public abstract class Animal {
    //protected properties, private to user but public to child sub class
    protected static int maxId = -1;
    protected int id;
    protected String name;
    protected int yearNamed;


    public Animal(String name, int yearNamed) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public int getYearNamed() {
        return yearNamed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearNamed(int yearNamed) {
        this.yearNamed = yearNamed;
    }

    //methods that all children will have access to

    //will need to be overriden by child classes
    public String move(){
        return "test";
    }
    public String breath(){
        return "test";
    }
    public String reproduce(){
        return "test";
    }


    @Override
    public String toString() {
        return "\n" + "ID: " + id + "\n" +
        "Name: " + name + "\n" +
        "Year Named: " + yearNamed;
    }


}