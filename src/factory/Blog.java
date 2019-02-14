package factory;

public class Blog extends Website {

	/*
	 * PostPage *is* a Page, because PostPage extends Page. Anything a Page can do,
	 * a PostPage can do. Liskow subsitution principle - you can always replace a
	 * base class instance by a sub-class So pages.add(new PostPage()); is in effect
	 * pages.add(.. a Page.. );
	 */

	
	@Override
	public void createWebsite() { // this methods is main piece of code for generating factory
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());

	}

}
