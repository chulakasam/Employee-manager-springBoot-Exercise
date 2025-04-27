package lk.ijse.employee_demo.DAO;

import lk.ijse.employee_demo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getSelectedEmployee(int id);

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);
}
