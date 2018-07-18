package com.prodfinder;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.InitialContext;
import javax.sql.DataSource;


public class HanaDBConnection
{
	public static String connectionString = "jdbc:sap://vadbfae.od.sap.biz:30044/";
	public static String user = "PRASHIL";
	public static String password = "SapHana123";
	private static final String DRIVER = "com.sap.db.jdbc.Driver";

	public static Connection getConnection()
	{
		final InitialContext ctx = null;
		DataSource ds = null;
		Connection conn = null;
		try
		{
			final InitialContext initContext = new InitialContext();
			//final Context envContext = (InitialContext) ctx.lookup("java:comp/env");
			ds = (DataSource) initContext.lookup("java:comp/env/jdbc/defaultDB");
			//ds = (DataSource) ctx.lookup("jdbc/defaultDB");
			//conn = getConnection(DRIVER, connectionString, user, password);
			conn = ds.getConnection();
		}
		catch (final Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	private static Connection getConnection(final String driver, final String url, final String user, final String password)
			throws Exception
	{
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

}
