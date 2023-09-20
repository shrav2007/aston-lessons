package main.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Phonebook {

	Map<String, String> myMap = new HashMap<>();

	public void add(String phoneNumber, String name) {
		myMap.put(phoneNumber, name);
	}

	public List<String> get(String name) {
		return myMap.entrySet().stream()
				.filter(entry -> entry.getValue().equals(name))
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
	}

}
