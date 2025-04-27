package lk.ijse.employee_demo.controller;

import lk.ijse.employee_demo.DAO.EmployeeDAO;
import lk.ijse.employee_demo.Entity.Employee;
import lk.ijse.employee_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/view")
    public void getAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }
    }
    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/view/{id}")
    public Employee getEmployee(@PathVariable int id) {
          return employeeService.getSelectedEmployee(id);
    }
    @PutMapping("/update/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        employeeService.updateEmployee(employee,id);
    }
    @DeleteMapping("/remove/{id}")
    public void removeEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
