package com.zbz.service;

import com.zbz.bean.Employee;
import com.zbz.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: ag
 * @date: 2019/3/14 10:28
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /**增*/
    public Employee insertEmployee(Employee employee) {
        System.out.println("插入数据");
        employeeMapper.insertEmployee(employee);
        return employee;
    }
    /**查*/
    public Employee getEmployee( Integer id) {
        Employee employee = employeeMapper.getEmployeeById(id);
        return employee;
    }
    /**改*/
    public Employee updateEmployee(Employee employee) {
        int result = employeeMapper.updateEmployee(employee);
        Employee employee1 = employeeMapper.getEmployeeById(employee.getId());
        return employee1;
    }
    /**删*/
    public Employee deleteEmployee(Integer id) {
        employeeMapper.deleteEmployeeById(id);
        return null;
    }
}
