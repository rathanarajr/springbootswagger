package com.dxc.database;

import java.util.HashMap;
import java.util.Map;

import com.dxc.model.Customer;

public class DatabaseClass {

		private static Map<Long,Customer> employees = new HashMap<Long, Customer>();

		public static Map<Long, Customer> getData() {
			return employees;
		}
		
		
		
	}


