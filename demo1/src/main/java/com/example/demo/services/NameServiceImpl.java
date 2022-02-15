package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Name;
@Service
public class NameServiceImpl implements NameService {

	List<Name> list;
	public NameServiceImpl() {
		list =  new ArrayList<>();
		list.add(new Name(145,"Harshika","Chandvani"));
		list.add(new Name(4543,"Rahul","Chandvani"));
	}
	public List<Name> getGreeting() {
		// TODO Auto-generated method stub
		return list;
	}

}
