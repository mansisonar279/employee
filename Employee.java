public class Employee{
    String name;
    int id;
    double salary;
    int age;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name:" +name);
        System.out.println("salary:" +salary);
        System.out.println("age:"+age);

    

    }
    public static void main(String[] args){
    Employee emp1=new Employee("XYZ",101,500000.0)
    emp1.displayInfo();
    }

}
