package com.gradinfo.spring_boot_grad_info.repository;

import com.gradinfo.spring_boot_grad_info.entity.SysStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<SysStudent,String> {


    @Query(value="select pro from SysStudent pro where pro.student_name=?1")
    SysStudent findInfoByName(String student_name);

    @Query(value="select pro from SysStudent pro where pro.student_id=?1")
    SysStudent findInfoById(String student_id);

}
