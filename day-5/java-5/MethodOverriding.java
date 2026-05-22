
class Employee1{
 String name;
 int salary;
 Employee1(String name, int salary){
     this.name=name;
     this.salary=salary;

 }
 int baseSalary(){
     return salary;
 }
}
class Manager1 extends Employee1{
    int teamsize;
Manager1(String name,int salary,int teamsize){
    super(name,salary);
    this.teamsize=teamsize;
 }
 @Override
int baseSalary() {
    int pay = salary + (teamsize*5000);
    return pay;
}
}
class Developer1 extends Employee1{
    String programming;
    Developer1(String name, int salary, String programming){
        super(name,salary);
        this.programming=programming;
    }
    @Override
    int baseSalary() {
        return salary + 5000;
    }

}
public class MethodOverriding {
    public static void main(String[] args){
        Manager1 m=new Manager1("teja",50000,5);
        Developer1 d=new Developer1("chintu",60000,"java");
        System.out.println(m.baseSalary());
        System.out.println(d.baseSalary());

    }
}
