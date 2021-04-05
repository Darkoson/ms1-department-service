package com.opdark.controller;

import com.opdark.entity.Department;
import com.opdark.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info(" We are in saveDepartment of DepartmentController");
        return service.saveDepartment(department);
    }

    @RequestMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info(" We are in findDepartmentById of DepartmentController");
        return service.findDepartmentById(departmentId);
    }


}
