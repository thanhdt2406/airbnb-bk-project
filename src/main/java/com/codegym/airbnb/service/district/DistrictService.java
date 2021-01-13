package com.codegym.airbnb.service.district;

import com.codegym.airbnb.model.District;
import com.codegym.airbnb.repository.IDistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DistrictService implements IDistrictService{
    @Autowired
    private IDistrictRepo districtRepo;
    @Override
    public Iterable<District> findAll() {
        return districtRepo.findAll();
    }

    @Override
    public Optional<District> findById(Long id) {
        return districtRepo.findById(id);
    }

    @Override
    public District save(District district) {
        return districtRepo.save(district);
    }

    @Override
    public void delete(Long id) {
        districtRepo.deleteById(id);
    }
}