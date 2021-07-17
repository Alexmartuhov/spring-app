package com.example.springapp.service;

import com.example.springapp.controller.dto.DriverDto;
import org.springframework.stereotype.Service;

@Service
public interface DriverService {
    DriverDto creatDriver(DriverDto dto);
}
