class Employee{
    void work(){
        System.out.println("Employee works in: Microsoft");
    }
}
class Manager extends Employee{
    void attend_meeting(){
        System.out.println("Attend meeting:20/25");
    }
}
void main(){
    Employee e = new Employee();
    e.work();
    Manager m = new Manager();
    m.attend_meeting();
}
