package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * @Description 新增员工
     * @Author lhbll
     * @Date 2023/11/29 21:04
     * @Version 1.0
    */
    void save(EmployeeDTO employeeDTO);

    /**
     * @Description 分页查询
     * @Author lhbll
     * @Date 2023/12/3 14:30
     * @Version 1.0
    */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
