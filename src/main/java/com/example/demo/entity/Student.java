package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long studentID;

    @NotBlank(message = "学生姓名不能为空！")
    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_birthday")
    private Date studentBirthday;

    @ManyToOne(targetEntity = Clazz.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "student_clazz")
    private Clazz studentClazz;

}
