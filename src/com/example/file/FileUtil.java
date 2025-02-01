package com.example.file;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileUtil {

	private File path = null;

	public FileUtil(File path) {
		this.path = path;
	}

	public <T> void writeDataInFile(T t) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(path, t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
