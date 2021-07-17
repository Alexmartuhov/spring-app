package com.example.springapp.service;

import com.example.springapp.controller.dto.DriverDto;
import com.example.springapp.dao.DriverDao;
import com.example.springapp.dao.entities.DriverEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

    private DriverDao driverDao;
    public DriverServiceImpl(DriverDao driverDao){
        this.driverDao=driverDao;
    }

    @Override
    public DriverDto creatDriver(DriverDto dto){
        DriverEntity driver=new DriverEntity();
        driver.setId(dto.getId());
        driver.setAge(dto.getAge());
        driver.setFirstName(dto.getFirstName());
        driver.setSecondName(dto.getSecondName());
        driverDao.save(driver);
        return dto;
    }
}
