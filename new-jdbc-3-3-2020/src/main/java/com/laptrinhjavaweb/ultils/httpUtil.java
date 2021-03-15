package com.laptrinhjavaweb.ultils;

import java.io.BufferedReader;
import java.io.IOException;

public class httpUtil { // chuyen tu json sang string json
	private String value;
	
	public httpUtil(String value) {
		this.value = value;
	}
	
	public <T> T toModel(Class<T> tClass)
	public static httpUtil of(BufferedReader bufferedReader) {
		StringBuilder sb = new StringBuilder();
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			System.out.println();
		}
		return new httpUtil(sb.toString());
	}
}
