package com.wiltech.springbootapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The type Employee controller.
 */
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    /**
     * Create employee.
     *
     * @param employee the employee
     * @return the employee
     */
    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }


    /**
     * Find one employee.
     *
     * @param id the id
     * @return the employee
     */
    @GetMapping(path = {"/{id}"})
    public Employee findOne(@PathVariable("id") int id){
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setEmail("Wil@wil");
//        employee.setFirstName("Wil");
//        employee.setLastName("Ferraciolli");
//        employee.setPhone("0754595278");
//        return employee;
        return employeeService.findById(id);
    }

    /**
     * Update employee.
     *
     * @param employee the employee
     * @return the employee
     */
    @PutMapping
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    /**
     * Delete employee.
     *
     * @param id the id
     * @return the employee
     */
    @DeleteMapping(path ={"/{id}"})
    public Employee delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    }


    /**
     * Find all list.
     *
     * @return the list
     */
    @GetMapping
    public List findAll(){
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setEmail("Wil@wil");
//        employee.setFirstName("Wil");
//        employee.setLastName("Ferraciolli");
//        employee.setPhone("0754595278");
//        return Arrays.asList(employee);
        return employeeService.findAll();
    }
}
