package com.retail;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


	enum OrderStatus {
		PENDING,
		PROCESSING,
		SHIPPED,
		DELIVERED
	}
	
	class order{
		
		String orderID;
		String customerID;
		String productID;
		int quantity;
		OrderStatus status;
		
		
		public order(String orderID, String customerID, String productID, int quantity, String status) {
			super();
			this.orderID = orderID;
			this.customerID = customerID;
			this.productID = productID;
			this.quantity = quantity;
			this.status = OrderStatus.PENDING;
		}


		@Override
		public String toString() {
			return "order [orderID=" + orderID + ", customerID=" + customerID + ", productID=" + productID
					+ ", quantity=" + quantity + ", status=" + status + "]";
		}


		
	}

	class Inventory{
		private HashMap<String, Integer> stock = new HashMap<>();
		
		public void addProduct(String productID, int quantity) {
			stock.put(productID, stock.getOrDefault(productID, 0) + quantity);
		}
		
		public boolean checkStock(String productID, int quantity) {
			return stock.getOrDefault(productID, 0) >= quantity;
		}
		
		public void updateStock(String productID, int quantity) {
			stock.put(productID, stock.get(productID) - quantity);
			
		}
		
	}
	
	class OrderManager{
		private Queue<order> ordersQueue = new LinkedList<>();
		private Inventory inventory;
		
		public OrderManager(Inventory inventory) {
			this.inventory = inventory;
			
		}
		public void addOrder(order ord){
			if (inventory.checkStock(ord.productID, ord.quantity)){
				ordersQueue.add(ord);
				inventory.updateStock(ord.productID, ord.quantity);
				ord.status = OrderStatus.PROCESSING;
				System.out.println(ord.orderID);
				
			}else {
				System.out.println(ord.orderID);
			}
		}
		public void processOrders() {
			while(!ordersQueue.isEmpty()) {
				order ord = ordersQueue.poll();
				ord.status = OrderStatus.SHIPPED;
				System.out.println(ord.orderID);
        }
			// TODO Auto-generated method stub
			
		}
		
		
	}
	public class RetailHub {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addProduct("P001", 100);
		
		OrderManager orderManager = new OrderManager(inventory);
		
		order order1 = new order("001", "002", "003", 2, null );
		order order2 = new order("001", "002", "003", 3, null );
		
		orderManager.addOrder(order1);
		orderManager.addOrder(order2);
		
		orderManager.processOrders();
		
		
		// TODO Auto-generated method stub

	}

}
