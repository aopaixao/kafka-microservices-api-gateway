package br.com.ekom.basedomains.dto;

public class OrderEventDTO {
	private String message;
	private String status;
	private OrderDTO order;

	public OrderEventDTO() {
	}

	public OrderEventDTO(String message, String status, OrderDTO order) {
		super();
		this.message = message;
		this.status = status;
		this.order = order;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderEventDTO [message=" + message + ", status=" + status + ", order=" + order + "]";
	}
}