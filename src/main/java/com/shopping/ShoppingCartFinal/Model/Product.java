package com.shopping.ShoppingCartFinal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="ProductId")
	private Integer prodId;
	@Column(name="ProductName")
	private String prodName;
	@Column(name="ProductDesc")
	private String prodDesc;
	@Column(name="ProductImage")
	private byte[] prodImage;
	
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public byte[] getProdImage() {
		return prodImage;
	}
	public void setProdImage(byte[] prodImage) {
		this.prodImage = prodImage;
	}
}
