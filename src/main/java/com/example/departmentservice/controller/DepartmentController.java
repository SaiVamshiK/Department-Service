package com.example.departmentservice.controller;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("Inside saveDepartment method of department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable("departmentId") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

}
