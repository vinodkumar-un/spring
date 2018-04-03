package com.sdp.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppFactory {
	private static Properties props;

	static {
		props = new Properties();
		try {
			props.load(AppFactory.class.getClassLoader().getResourceAsStream(
					"com/sdp/common/app-classes.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object createObject(String l_clazz)
			throws FileNotFoundException, IOException, InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		String clazzName = null;
		Object obj = null;

		clazzName = props.getProperty(l_clazz);
		obj = Class.forName(clazzName).newInstance();
		return obj;
	}
}
