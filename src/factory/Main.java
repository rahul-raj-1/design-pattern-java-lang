package factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Website site = WebsiteFactory.getWebsite("blog");
		
		
		System.out.println(site.getPages());
		

	}

}
