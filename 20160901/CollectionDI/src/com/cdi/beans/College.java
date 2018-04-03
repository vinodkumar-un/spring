package com.cdi.beans;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class College {
	private Map<String, Course> hodToCourse;
	private Properties courseToppers;

	public void setHodToCourse(Map<String, Course> hodToCourse) throws FileNotFoundException {
		this.hodToCourse = hodToCourse;
	}

	public void setCourseToppers(Properties courseToppers) {
		this.courseToppers = courseToppers;
	}

	@Override
	public String toString() {
		return "College [hodToCourse=" + hodToCourse + ", courseToppers="
				+ courseToppers + "]";
	}

}
