package FacadeDesignPattern;

public class ZomatoApp {
	private Restaurent restaurent = new Restaurent();
	private DeliveryTeam delivery = new DeliveryTeam();
	private DeliveryBoy deliveryBoy = new DeliveryBoy();

	public void placeOrder() {
		restaurent.prepareOrder();
		delivery.assignDelivery();
		deliveryBoy.pickUp();
		deliveryBoy.delivery();
	}
}
