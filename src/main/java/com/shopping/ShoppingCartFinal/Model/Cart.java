package com.shopping.ShoppingCartFinal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
	@Id
	@Column(name = "CartID")
	@GeneratedValue
	private Integer cartId;
	@Column(name = "cartName")
	private String cartName;
	@Column(name = "cartDesc")
	private String cartDesc;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public String getCartDesc() {
		return cartDesc;
	}

	public void setCartDesc(String cartDesc) {
		this.cartDesc = cartDesc;
	}
}
