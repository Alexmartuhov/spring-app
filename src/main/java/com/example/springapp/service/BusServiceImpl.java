package com.example.springapp.service;

import com.example.springapp.controller.dto.BusDto;
import com.example.springapp.dao.BusDao;
import com.example.springapp.dao.entities.BusEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BusServiceImpl implements BusService {


    private BusDao busDao;
    public BusServiceImpl(BusDao busDao){
        this.busDao=busDao;
    }

    @Override
    public BusDto creatBus(BusDto dto) {
        BusEntity bus=new BusEntity();
        bus.setId(dto.getId());
        bus.setMileage(dto.getMileage());
        bus.setModel(dto.getModel());
        busDao.save(bus);
        return dto;
    }

    @Override
    public BusDto getBus(Integer id){
        BusEntity busEntity= busDao.findById(id).orElse(null);
        BusDto bus=null;
        if(Objects.nonNull(busEntity)){
            bus=new BusDto();
            bus.setId(busEntity.getId());
            bus.setMileage(busEntity.getMileage());
            bus.setModel(busEntity.getModel());
        }
        return bus;
    }

    @Override
    public BusDto deleteBus (Integer id){
        BusEntity busEntity= busDao.findById(id).orElse(null);
        BusDto bus=null;
        if(Objects.nonNull(busEntity)){
            bus=new BusDto();
            bus.setId(busEntity.getId());
            bus.setMileage(busEntity.getMileage());
            bus.setModel(busEntity.getModel());
            busDao.delete(busEntity);
        }
        return bus;
    }
}
