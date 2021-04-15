import java.util.Iterator;
import java.util.TreeSet;

public class Company implements ICompany {
    String companyName;
    String address;
    TreeSet<Employee> staff;


    @Override
    public boolean addEmployee(Employee emp) {
        return staff.add(emp);
    }

    @Override
    public boolean fireEmployee(int id) {
        return staff.remove(id);
    }

    @Override
    public Employee findEmployeeById(int id) {
        //for (int i=0;i< staff.size();i++){
        Iterator<Employee> it = staff.iterator();
        Employee current;
        while (it.hasNext()) {
            current = it.next();
            if (current.id == id) {
                return current;
            } else {
                return null;
            }
        }
    }

    @Override
    public double totalSalary() {
        Iterator<Employee> it = staff.iterator();
        Employee current;
        double sum = 0;
        while (it.hasNext()) {
            current = it.next();
            sum += current.salary;
        }
        return sum;
    }

        @Override
        public double avgSalary () {
            Iterator<Employee> it = staff.iterator();
            Employee current;
            double sum=0;
            double midlSum=0;
            while (it.hasNext()) {
                current = it.next();
                sum += current.salary;
                midlSum=sum/ staff.size();
            }return midlSum;


        }

        @Override
        public void display () {
            System.out.print("Company name: "+companyName+"Address: "+address+"Employees: "+staff);

        }
    }
