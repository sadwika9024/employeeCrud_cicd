package com.pabba.employeeCRUD.service.Impl;

import com.pabba.employeeCRUD.service.DataService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImplDev implements DataService {

    @Override
    public String getData() {
        return "dev data";
    }
}