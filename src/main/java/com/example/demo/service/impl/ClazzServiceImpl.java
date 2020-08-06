package com.example.demo.service.impl;

import com.example.demo.repository.ClazzRepository;
import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lenovo
 */
@Service
public class ClazzServiceImpl implements ClazzService {

    ClazzRepository clazzRepository;

    @Autowired
    ClazzServiceImpl(ClazzRepository clazzRepository) {
        this.clazzRepository = clazzRepository;
    }

    @Override
    public List<Clazz> all() {
        return clazzRepository.findAll();
    }

    @Override
    public Clazz save(Clazz clazz) {
        return clazzRepository.save(clazz);
    }

    @Override
    public void deleteByClazzId(Long clazzId) {
        clazzRepository.deleteById(clazzId);
    }
}
