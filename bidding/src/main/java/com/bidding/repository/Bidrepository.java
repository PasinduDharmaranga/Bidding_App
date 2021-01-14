package com.bidding.repository;

import com.bidding.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bidrepository extends CrudRepository<User, Long> {

}
