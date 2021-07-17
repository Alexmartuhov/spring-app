package com.example.springapp.controller;

import com.example.springapp.controller.dto.DriverDto;
import com.example.springapp.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private DriverService driverService;
    public DriverController (DriverService driverService){
        this.driverService=driverService;
    }

    @PostMapping
    public ResponseEntity<DriverDto> creatDriver (@RequestBody DriverDto driver) {
        return new ResponseEntity<>(driverService.creatDriver(driver), HttpStatus.OK);
    }

}
