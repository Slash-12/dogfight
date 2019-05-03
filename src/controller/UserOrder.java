package controller;

public class UserOrder implements IUserOrder {

	private int player;
	private Order order;

	public UserOrder(int player, Order order) {
		this.player = player;
	}

	@Override
	public Order getOrder() {
		return null;
	}

	@Override
	public int getPlayer() {
		return 1;
	}
	
	
	
}
