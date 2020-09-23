package com.gourddoll.dao;

import com.gourddoll.entity.Address;
import com.gourddoll.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AddressDAO {

//    void save(Address address);
//
//    void update(Address address);
//
//    void delete(String id);
//
//    List<Address> findAll();

    User finById(String id);
}
