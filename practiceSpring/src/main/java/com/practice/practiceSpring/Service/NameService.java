package com.practice.practiceSpring.Service;

import org.springframework.stereotype.Service;

import com.practice.practiceSpring.Entity.Name;

@Service
	public interface NameService {
		public Name addName(Name name);
	}
