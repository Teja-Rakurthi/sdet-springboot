class Employee{
    String name;
    int ID;
    double salary;
    Employee(String name,int ID,double salary){
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }
    void employeedetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("salary: "+salary);
    }
}

class Manager extends Employee{
    String department;
Manager(String name,int ID,double salary,String department){
    super(name,ID,salary);
    this.department=department;
    }
    void team(){
        System.out.println("department: "+department);
    }
}
class Developer extends Employee{
 String programming;
 Developer(String name,int ID,double salary,String programming){
     super(name,ID,salary);
     this.programming=programming;
 }
 void code(){
     System.out.println("programming in: "+programming);
 }
}

public class Employeeheirarchy{
    public static void main(String[] args){
        Manager m = new Manager("teja",24,26399,"HR");
        Developer d = new Developer("chintu",25,26399,"JAVA");
        System.out.println("Manager details:");
        m.employeedetails();
        m.team();
        System.out.println();
        System.out.println("Developer details:");
        d.employeedetails();
        d.code();
    }
}