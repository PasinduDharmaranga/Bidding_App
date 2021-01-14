package com.bidding.service;

import com.bidding.model.User;
import com.bidding.repository.Bidrepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService implements IBidService {

    @Autowired
    private Bidrepository repository;

    @Override
    public List<User> findAll() {

        return (List<User>) repository.findAll();
    }
}
