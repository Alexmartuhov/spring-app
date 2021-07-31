package com.example.springapp.controller;


import com.example.springapp.controller.dto.BusDto;
import com.example.springapp.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    private BusService busService;
    public BusController (BusService busService){
        this.busService=busService;
    }

    @PostMapping
    public ResponseEntity<BusDto> creatBus (@RequestBody BusDto bus) {
        return new ResponseEntity<>(busService.creatBus(bus), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusDto> getBus(@PathVariable Integer id) {
        return new ResponseEntity<>(busService.getBus(id), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBus (@PathVariable Integer id) {
        busService.deleteBus(id);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
