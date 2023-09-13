package main.java;

import java.util.Arrays;

public class AppData {
	
	private String[] header;
	private int[][] data;
	
	public AppData(String[] header, int[][] data) {
		this.header = header;
		this.data = data;
	}
	
	public String[] getHeader() {
		return header;
	}
	
	public int[][] getData() {
		return data;
	}

	public void print() {
		System.out.println(Arrays.toString(header));
		for (int i = 0; i < data.length; i++) {
		    System.out.println(Arrays.toString(data[i]));
		}
	}
	
}
