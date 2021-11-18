package com.gradinfo.spring_boot_grad_info.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sys_student")
public class SysStudent {

    @Id
   // @GeneratedValue
//    private int id;
//    private String name;
//    private int quantity;
//    private double price;


    private String student_id;
    private String student_postid;
    private String student_name;
    private String student_sex;
    private String student_birthday;
    private String student_country;
    private String student_race;
    private String student_phone;
    private String student_email;
    private String student_p_email;
    private String student_t_address;
    private String student_er_phone;
    private String student_er_name;


}
