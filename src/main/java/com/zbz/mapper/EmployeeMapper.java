package com.zbz.mapper;

import com.zbz.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface EmployeeMapper {

    public int insertEmployee(Employee employee);
    public Employee getEmployeeById(Integer id);
    public int updateEmployee(Employee employee);
    public int deleteEmployeeById(Integer id);
}
