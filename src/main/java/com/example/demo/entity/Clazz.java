package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "clazz_id")
    private Long clazzId;

    @NotBlank(message = "班级名称不能为空")
    @Column(name = "clazz_name")
    private String clazzName;

}
