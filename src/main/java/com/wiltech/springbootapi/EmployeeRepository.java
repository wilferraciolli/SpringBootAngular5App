package com.wiltech.springbootapi;

import org.springframework.data.repository.Repository;

import java.util.List;


/**
 * The interface Employee repository.
 */
public interface EmployeeRepository extends Repository<Employee, Integer> {

    /**
     * Delete.
     *
     * @param employee the employee
     */
    void delete(Employee employee);

    /**
     * Find all list.
     *
     * @return the list
     */
    List findAll();

    /**
     * Find one employee.
     *
     * @param id the id
     * @return the employee
     */
    Employee findOne(int id);

    /**
     * Save employee.
     *
     * @param employee the employee
     * @return the employee
     */
    Employee save(Employee employee);
    }
