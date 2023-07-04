package com.example.colors.service;

import com.example.colors.model.SelectedColor;

import java.util.List;

public interface SelectedColorService {
    void save(String color);
    void save (SelectedColor selectedColor);
    List<SelectedColor> getAllData();
}
