package lk.ijse.employee_demo.service.impl;

import lk.ijse.employee_demo.DAO.EmployeeDAO;
import lk.ijse.employee_demo.Entity.Employee;
import lk.ijse.employee_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
            employeeDAO.saveEmployee(employee);
    }

    @Override
    public Employee getSelectedEmployee(int id) {
        Employee selectedEmployee = employeeDAO.getSelectedEmployee(id);
        return selectedEmployee;
    }

    @Override
    public void updateEmployee(Employee employee, int id) {
        employeeDAO.updateEmployee(employee, id);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
