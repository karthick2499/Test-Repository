package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double f,c;
		
		System.out.println("Enter:");
		f=Double.parseDouble(br.readLine());
		
		c=(5*(f-32))/9;
		
		System.out.println(c);

	}

}
