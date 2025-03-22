class Address{
    private String street,city,state;
    public Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }
    public String toString(){
        return this.street+","+this.city+","+this.state;
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;
    private Address address;
    public Employee(int id,String name,double salary,Address address){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
    public String toString(){
        return this.id+","+this.name+","+this.salary+","+this.address;
    }
}
public class has_a_rel{
    public static void main(String args[]) {
        Address addr=new Address("123 Main St","Eluru","AP");
        Employee emp=new Employee(101,"Pratik",75000,addr);
        System.out.println(emp);
    }
}