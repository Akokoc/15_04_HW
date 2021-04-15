public interface ICompany {
    boolean addEmployee(Employee emp);
    boolean fireEmployee(int id);
    Employee findEmployeeById(int id);
    double totalSalary();
    double avgSalary();
    void display();
}
