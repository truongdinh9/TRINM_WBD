package vn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.com.model.Province;
import vn.com.repository.ProvinceRepository;
import vn.com.service.ProvinceService;


public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
            provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
