package com.hk.commentservice.repository;

import com.hk.commentservice.dto.EmployeeDTO;
import com.hk.commentservice.entity.Department;
import com.hk.commentservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    @Query("SELECT d.employees FROM Department d WHERE d.depId = :depId")
    Set<Employee> findEmployeesByDepartmentId(@Param("depId") int depId);

    @Query("SELECT new com.hk.commentservice.dto.EmployeeDTO(e.employeeId, e.employeeName, e.department.depId, e.department.departmentName) " +
            "FROM Department d JOIN d.employees e WHERE d.depId = :depId")
    Set<EmployeeDTO> findEmployeeDTOsByDepartmentId(@Param("depId") int depId);

}
