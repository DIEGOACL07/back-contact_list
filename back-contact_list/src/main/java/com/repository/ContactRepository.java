 package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

    
}