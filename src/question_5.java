class Member
{
    String Name, Phone_number, Address;
    int Age, Salary;

    public void printSalary()
    {
        System.out.println(Salary);
    }

}

class Employee extends Member
{
    String specialization;
}

class Manager extends Member
{
    String department;
}

class xyz
{
    public static void main(String[] args){
        Employee e = new Employee();
        e.Name = "Dinesh";
        e.Age = 22;
        e.Phone_number = "7072637222";
        e.Address = "Pune";
        e.Salary = 1200000;
        e.specialization = "DBA";
        e.printSalary();

        Manager m = new Manager();
        m.Name = "Ajay";
        m.Age = 29;
        m.Phone_number = "7072233232";
        m.Address = "Pune";
        m.Salary = 1200000;
        m.department = "xyz";
        m.printSalary();
    }
}