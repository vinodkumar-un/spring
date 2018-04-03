package com.don.accessors;

import java.io.IOException;
import java.util.Properties;

public class CityRIPropsFileAccessor extends AbstractAccessor {

	public CityRIPropsFileAccessor(String key) {
		super(key);
	}

	@Override
	public Object getData() {
		Properties props = null;
		props = new Properties();
		try {
			props.load(this.getClass().getClassLoader()
					.getResourceAsStream("city-ri.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

}
