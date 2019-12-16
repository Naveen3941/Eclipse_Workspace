package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.MvcRepository;

@Service
public class MvcService {
@Autowired
MvcRepository repository;



}
