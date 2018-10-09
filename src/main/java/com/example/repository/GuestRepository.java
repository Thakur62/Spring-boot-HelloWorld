package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;


import org.springframework.stereotype.Repository;

import com.example.enity.Guest;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}