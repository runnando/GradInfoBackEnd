package com.gradinfo.spring_boot_grad_info.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sys_student_post")
public class SysStudentPost {
    @Id
    private String student_post_id;
    private String sp_post_number;
    private String student_id;
    private String sp_ndocs;
    private String sp_traansdate;
    private String sp_major;
    private String sp_confu;
    private String sp_obj;
    private String sp_admit;
    private String sp_readmit;
}
