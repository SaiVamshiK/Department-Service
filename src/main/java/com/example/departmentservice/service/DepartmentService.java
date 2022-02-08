package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of department Service");
        return departmentRepository.save(department);
    }
}
