package com.wiltech.springbootapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Employee repository.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * Delete.
     *
     * @param employee the employee
     */
//    public void delete(Employee employee);
//
//    /**
//     * Find all list.
//     *
//     * @return the list
//     */
//    public List<Employee> findAll();
//
//    /**
//     * Find one employee.
//     *
//     * @param id the id
//     * @return the employee
//     */
//    public Employee findOne(int id);
//
//    /**
//     * Save employee.
//     *
//     * @param employee the employee
//     * @return the employee
//     */
//    public Employee save(Employee employee);
}
