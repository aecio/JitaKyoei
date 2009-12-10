package org.fpij.jitakyoei.util;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ext.ExtObjectContainer;

public class DatabaseManager {
	public static final String PRODUCTION = "fpij.db";
	public static final String TEST 	  = "test.db";
	public static String ENVIROMENT = PRODUCTION;
	private static ExtObjectContainer db;

	public static ExtObjectContainer getConnection() {
		open();
		return db;
	}

	public static void open() {
		ObjectContainer objectContainer = Db4o.openFile(ENVIROMENT);
		db = objectContainer.ext();
	}

	public static void close() {
		if (!db.isClosed()){
			db.close();
		}
	}

	public static void setEnviroment(String env) {
		ENVIROMENT = env;
	}
}
