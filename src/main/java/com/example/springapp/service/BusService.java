package com.example.springapp.service;

import com.example.springapp.controller.dto.BusDto;


public interface BusService {
    BusDto creatBus(BusDto bus);

    BusDto getBus(Integer id);

    BusDto deleteBus (Integer id);
}
