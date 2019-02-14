package factory;

public class WebsiteFactory {
	
	
	public static Website getWebsite(String siteType)
	{
		switch(siteType) 
		{
		case "blog":
		{
			return new Blog();
		}
		
		default:
		{
         return null;
		}
		
		}
		
	}

}
