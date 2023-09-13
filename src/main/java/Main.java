package main.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String[] header = { "Value1", "Value2", "Value3" };
		int[][] data = { { 100, 200, 123 }, { 300, 400, 500 } };
		AppData appData = new AppData(header, data);
		save(appData);
		AppData appDataReaded = read();
		appDataReaded.print();
	}

	private static void save(AppData appData) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.csv"))) {
			String[] header = appData.getHeader();
			for (int i = 0; i < header.length; i++) {
				writer.write(header[i] + ";");
			}
			writer.write("\n");
			int[][] data = appData.getData();
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					writer.write(String.valueOf(data[i][j]) + ";");
				}
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static AppData read() {
		AppData appData = null;
		try (BufferedReader reader = new BufferedReader(new FileReader("demo.csv"))) {
			String[] header = null;
			int[][] data = new int[2][];
			String csvSplitBy = ";";
			String line;
			int k = 0;
			String[] strings;
			boolean hasHeader = false;
			while ((line = reader.readLine()) != null) {
				if (!hasHeader) {
					header = line.split(csvSplitBy);
					hasHeader = true;
				} else {
					strings = line.split(csvSplitBy);
					int[] numbers = new int[strings.length];
					for (int i = 0; i < strings.length; i++) {
						numbers[i] = Integer.parseInt(strings[i]);
					}
					data[k] = numbers;
					k++;
				}
			}
			appData = new AppData(header, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appData;
	}

}
