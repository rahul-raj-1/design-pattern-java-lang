package singleton;

public class DbSingleton {
	
	
	private static DbSingleton  dbSingletonInstance =null;

	//this private constructor wont allow anyone to create instance of this Class as it is private 
	private DbSingleton () {
	}

	
	///method has to be static so we can call the getter getDbSingletonInstance from other classes
	public static DbSingleton getDbSingletonInstance() {
		if (dbSingletonInstance==null)
		{
			dbSingletonInstance = new DbSingleton();
		}
		return dbSingletonInstance;
	}


	
	
	
}
