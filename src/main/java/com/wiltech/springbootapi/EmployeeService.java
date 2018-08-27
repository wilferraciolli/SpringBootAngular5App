package com.wiltech.springbootapi;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The interface Employee service.
 */
@Service
public interface EmployeeService {

    /**
     * Create employee.
     *
     * @param employee the employee
     * @return the employee
     */
    public Employee create(Employee employee);

    /**
     * Delete employee.
     *
     * @param id the id
     * @return the employee
     */
    public Employee delete(int id);

    /**
     * Find all list.
     *
     * @return the list
     */
//    public List findAll();
    public List<Employee> findAll();

    /**
     * Find by id employee.
     *
     * @param id the id
     * @return the employee
     */
    public Employee findById(int id);

    /**
     * Update employee.
     *
     * @param employee the employee
     * @return the employee
     */
    public Employee update(Employee employee);
}
