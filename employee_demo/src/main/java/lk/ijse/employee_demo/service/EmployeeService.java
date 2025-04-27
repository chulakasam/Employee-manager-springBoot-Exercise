package lk.ijse.employee_demo.service;

import lk.ijse.employee_demo.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getSelectedEmployee(int id);

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);
}
