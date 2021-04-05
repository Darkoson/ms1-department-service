package com.opdark.service;

import com.opdark.entity.Department;
import com.opdark.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department){
        return repository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repository.findById(departmentId).orElse(null);
    }
}
