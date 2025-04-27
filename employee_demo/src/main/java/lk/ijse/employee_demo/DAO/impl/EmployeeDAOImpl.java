package lk.ijse.employee_demo.DAO.impl;

import jakarta.persistence.EntityManager;
import lk.ijse.employee_demo.DAO.EmployeeDAO;
import lk.ijse.employee_demo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> getAllEmployees() {
       return entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
    }

    @Override
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public Employee getSelectedEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee, int id) {
        Employee employee1 = entityManager.find(Employee.class, id);
        employee1.setFirst_name(employee.getFirst_name());
        employee1.setLast_name(employee.getLast_name());
        employee1.setEmail(employee.getEmail());
    }

    @Override
    public void deleteEmployee(int id) {
        entityManager.remove(entityManager.find(Employee.class, id));
    }

}
