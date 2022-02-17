package com.practice.practiceSpring.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.practice.practiceSpring.Entity.Name;

@Service
public class NameServiceImpl implements NameService {
	List <Name> list;

	public NameServiceImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		list.add(new Name("Yash","Jain"));
	}

	@Override
	public Name addName(Name name) {
		// TODO Auto-generated method stub
		list.add(name);
		return name;
	}
	
}
