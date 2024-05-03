import java.util.Scanner;

class person{
    protected  int id;
    protected String name;
    protected String address;
    person(){
        id = 0;
        name = null;
        address = null;
    }

    public person(int id, String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = sc.nextInt();
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter address : ");
        address = sc.next();
    }
    public void output(){
        System.out.println("id : "+id);
        System.out.println("name : "+name);
        System.out.println("address : "+address);
    }

}
class Human extends person{
    private int salary;
    public Human(){
        super();
        salary = 0;
    }
    public Human(int id, String name,String address,int salary){
        this.salary = salary;
    }
    public void input(){
        super.input();
        System.out.println("Enter salary : ");
        Scanner sc = new Scanner(System.in);
        salary = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("Salary : "+salary+" $");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Human h = new Human();

        h.input();
        h.output();

    }
}