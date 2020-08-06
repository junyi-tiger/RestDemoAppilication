package com.example.demo.controller;

import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clazz")
@Slf4j
public class ClazzController {

    ClazzService clazzService;

    @Autowired
    ClazzController(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    @GetMapping("/all")
    public List<Clazz> all() {
        return clazzService.all();
    }

    @PostMapping("/save")
    public Clazz save(Clazz clazz) {
        return clazzService.save(clazz);
    }

    @DeleteMapping("/delete_by_clazz_id")
    public void deleteByClazzId(Long clazzId) {
        clazzService.deleteByClazzId(clazzId);
    }
}