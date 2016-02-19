/**
 *   File Name: Info.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Feb 10, 2016
 *
 */

package com.sqa.CM.util.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Info //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Info {

	public static void display2DInfo(Object[][] objects) {
		System.out.println("Display 2D Matrix");
		// System.out.println(Arrays.deepToString(objects));
		int rowLength = objects.length;
		for (int row = 0; row < objects.length; row++) {
			// System.out.println(Arrays.deepToString(objects[row]));
			int colLength = objects[row].length;
			for (int col = 0; col < colLength; col++) {
				System.out.print("\t" + objects[row][col]);
			}
			System.out.print("\n");
		}
	}

	// Use this method to get info about the class being passed
	public static void displayInfo(Object obj) {
		System.out.println("Object Type: " + obj.getClass().getSimpleName());
		System.out.print("\tFields are: " + Arrays.toString(getFieldNames(obj)) + "\n");
		System.out.print("\tMethods are: " + Arrays.toString(getMethodNames(obj)) + "\n");
	}

	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
	}

	public static void displayInfo(Object[] obj) {
		for (Object object : obj) {
			displayInfo(object);
		}
	}

	public static String get2DInfo(Object[][] objects) {
		StringBuilder sb = new StringBuilder();
		sb.append("Display 2D Matrix\n\n");
		// System.out.println(Arrays.deepToString(objects));
		int rowLength = objects.length;
		for (int row = 0; row < rowLength; row++) {
			// System.out.println(Arrays.deepToString(objects[row]));
			int colLength = objects[row].length;
			for (int col = 0; col < colLength; col++) {
				sb.append("\t" + objects[row][col]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String[] getFieldNames(Object obj) {
		String[] names;
		ArrayList<String> fieldNames = new ArrayList<String>();
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields) {
			fieldNames.add(field.getName());
		}
		names = new String[fieldNames.size()];
		fieldNames.toArray(names);
		return names;
	}

	public static String getInfo(Object obj) {
		return null;
	}

	public static String[] getMethodNames(Object obj) {
		String[] names;
		ArrayList<String> methodNames = new ArrayList<String>();
		Method[] methods = obj.getClass().getMethods();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}
		names = new String[methodNames.size()];
		methodNames.toArray(names);
		return names;
	}

}
