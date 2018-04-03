package com.ccl.loader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomClassLoader extends ClassLoader {
	private Map<String, Class<?>> classes;

	public CustomClassLoader(ClassLoader parent) {
		super(parent);
		classes = new HashMap<String, Class<?>>();
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		Class<?> clazz = null;

		// look into the cache
		if (classes.containsKey(name) == true) {
			return classes.get(name);
		}

		// principle of delegation
		try {
			return findSystemClass(name);
		} catch (ClassNotFoundException e) {

		}
		try {
			byte[] byteCode = loadClassFile(name);
			clazz = super.defineClass(byteCode, 0, byteCode.length);
			resolveClass(clazz);
			classes.put(name, clazz);
		} catch (IOException e) {
			throw new ClassNotFoundException(name, e);
		}

		return clazz;
	}

	private byte[] loadClassFile(String name) throws IOException {
		int b = -1;
		String BASE_DIR = "d:\\classes\\";
		String classFileName = null;
		FileInputStream fis = null;

		classFileName = name.replace(".", "/") + ".class";
		fis = new FileInputStream(new File(BASE_DIR + classFileName));
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while ((b = fis.read()) != -1) {
			bos.write(b);
		}
		fis.close();
		byte[] byteCode = bos.toByteArray();
		bos.close();
		return byteCode;
	}

}
