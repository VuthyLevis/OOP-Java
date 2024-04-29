class Person {
    protected int id;
    protected String name;
    protected String address;

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Human extends Person {
    private int score;

    public Human(int id, String name, String address, int score) {
        super(id, name, address);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("score: " + score);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Human student = new Human(007, "levis", "Phnom Penh", 90);
        student.displayInfo();
    }
}
