package com.example.colors.dao;

import com.example.colors.model.SelectedColor;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class SelectedColorDaoTest {
    public static final String BLUE = "blue";
    public static final String RED = "red";
    public static final int TOTAL = 3;

    @Autowired
    SelectedColorDao selectedColorDao;

    @BeforeEach
    void setUp() {
        SelectedColor selectedColor1 = new SelectedColor(BLUE, new Date());
        SelectedColor selectedColor2 = new SelectedColor(RED, new Date());
        SelectedColor selectedColor3 = new SelectedColor(RED, new Date());

        assertNull(selectedColor1.getId());
        assertNull(selectedColor2.getId());
        assertNull(selectedColor3.getId());

        selectedColorDao.save(selectedColor1);
        selectedColorDao.save(selectedColor2);
        selectedColorDao.save(selectedColor3);

        assertNotNull(selectedColor1.getId());
        assertNotNull(selectedColor2.getId());
        assertNotNull(selectedColor3.getId());

    }

    @Test
    void testFetchData(){
        SelectedColor selectedColor = selectedColorDao.findFirstByColor(RED);
        assertEquals(RED, selectedColor.getColor(), "Wrong color");
    }

    @Test
    void testFetchAllData(){
        Collection selectedColors = (Collection) selectedColorDao.findAll();
        assertEquals(TOTAL, selectedColors.size(), "Wrong total number");
    }
}
