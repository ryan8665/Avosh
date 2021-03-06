/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.FinanceDto;
import com.avosh.baseproject.repository.FinanceRepository;
import com.avosh.baseproject.services.FinanceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {
    private static final Logger log = Logger.getLogger(FinanceServiceImpl.class);
    @Autowired
    FinanceRepository repository;

    @Override
    public void save(FinanceDto dto) {

    }

    @Override
    public List<FinanceDto> retrieveAll() {
        return null;
    }
}
