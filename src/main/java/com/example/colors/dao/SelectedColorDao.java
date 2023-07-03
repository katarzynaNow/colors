package com.example.colors.dao;

import com.example.colors.model.SelectedColor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedColorDao extends CrudRepository<SelectedColor, Integer> {

    SelectedColor findFirstByColor(String color);
}
