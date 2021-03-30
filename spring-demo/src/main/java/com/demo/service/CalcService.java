package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

	public int add(int num1, int num2){
		System.out.println("add 被调用");
		return num1 + num2;
	}

	public int subtraction(int num1, int num2){
		System.out.println("subtraction 被调用");
		return num1 - num2;
	}

	public int multiplication(int num1, int num2){
		System.out.println("multiplication 被调用");
		return num1 * num2;
	}

	public int division(int num1, int num2){
		System.out.println("division 被调用");
		return num1 / num2;
	}
}
