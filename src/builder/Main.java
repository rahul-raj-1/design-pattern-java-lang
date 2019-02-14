package builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		LunchOrder.Builder  builder = new LunchOrder.Builder();

		builder.salad("tomato").curry("indian curry ");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getSalad());
		
		System.out.println(lunchOrder.getCurry());
;

	}

}
