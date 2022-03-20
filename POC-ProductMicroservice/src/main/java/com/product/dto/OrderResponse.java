package com.product.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class OrderResponse {

	private Long orderId;
	private Long customerId;
	private List<ItemResponse> items;
	private Double total;
	private ShippingInfosDTO shippinginfo;
	
	@Override
	public String toString() {
		return "(orderId=" + orderId + ", customerId=" + customerId + ", items=" + items + ", total="
				+ total + ", shippinginfo=" + shippinginfo+")";
	}
	
	
}
