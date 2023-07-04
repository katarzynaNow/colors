package com.example.colors.service.impl;

import com.example.colors.dao.SelectedColorDao;
import com.example.colors.model.SelectedColor;
import com.example.colors.service.SelectedColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SelectedColorServiceImpl implements SelectedColorService {
    @Autowired
    SelectedColorDao selectedColorDao;

    @Override
    public void save(String color) {
        selectedColorDao.save(new SelectedColor(color, new Date()));
    }

    @Override
    public void save(SelectedColor selectedColor) {
        this.save(selectedColor.getColor());
    }

    @Override
    public List<SelectedColor> getAllData() {
        return (List<SelectedColor>)selectedColorDao.findAll();
    }
}
