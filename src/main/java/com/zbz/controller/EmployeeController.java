package com.zbz.controller;

import com.zbz.bean.Employee;
import com.zbz.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ag
 * @date: 2019/3/14 10:29
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**增*/
    @GetMapping("/insert")
    @ApiOperation(value = "新增员工信息", notes = "新增员工信息")
    public Employee insertEmployee(Employee employee) {
        employeeService.insertEmployee(employee);
        return employee;
    }
    /**
     * 查
     */
    @GetMapping("/query/{id}")
    @ApiOperation(value = "查询员工信息", notes = "查询员工信息")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }
    /**改*/
    @GetMapping("/update")
    @ApiOperation(value = "更新员工信息", notes = "更新员工信息")
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeService.updateEmployee(employee);
        return employee1;
    }
    /**删*/
    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除员工信息", notes = "删除员工信息")
    public Employee deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return new Employee();
    }

}
