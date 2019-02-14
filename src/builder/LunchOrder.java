package builder;


/*
 * A good design in builder pattern is, all required parames must be in constructor 
 * and those optional must be in builder methods
 *
 * 
 * if you want to add PICKLE and make it mandotory .Create a constructor whch takes pickle as param
 * 
 * 
 * 
 */

public class LunchOrder {

	private final String salad;
	private final String curry;

	public static class Builder {

		private String salad;
        private String curry;

	
	
	public LunchOrder build() {
		return new LunchOrder(this); //The object of builder is being passed in to outer class
		                             //using constructor
	}

		public Builder salad(String salad) {
			this.salad = salad;
			return this;

		}

		public Builder curry(String curry) {
			this.curry = curry;
			return this;
			}
	}

	private LunchOrder(Builder builder) {

		this.salad = builder.salad;
		this.curry = builder.curry;

	}

	public String getSalad() {
		return salad;
	}

	public String getCurry() {
		return curry;
	}

}
