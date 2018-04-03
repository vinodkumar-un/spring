package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object ret = null;

		methodName = methodInvocation.getMethod().getName();
		System.out.println("in invoke for method : " + methodName);

		args = methodInvocation.getArguments();
		// perform logging before target class method executes
		System.out.print("entered into " + methodName + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");

		if ((Integer) args[0] == 0 && (Integer) args[1] == 0) {
			ret = 0;
		} else {
			// demonstration
			args[0] = (Integer) args[0] + 1;
			args[1] = (Integer) args[1] + 1;

			// now execute target class method
			ret = methodInvocation.proceed(); // this calls target class
												// method (add)
		}
		// after the target method executes again perform logging here
		System.out.println("exiting from " + methodName + " with ret : " + ret);
		ret = (Integer) ret + 1;

		return ret;
	}
}
