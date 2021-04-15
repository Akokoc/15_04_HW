import java.lang.annotation.Documented;

public class Employee implements Comparable<Employee> {
    String lastName;
    String firstName;
    int id;
    double salary;

    public Employee(String lastName, String firstName, int id, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        if (!lastName.equals(employee.lastName)) return false;
        return firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + id;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Employee o) {
        int res = lastName.compareTo(o.lastName);
        if (res == 0) {
            res = firstName.compareTo(o.firstName);
            if(res==0){
                res= Double.compare(o.salary,this.salary);
            }
        }
        return res;
    }
}
