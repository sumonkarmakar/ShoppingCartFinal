package com.shopping.ShoppingCartFinal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	@Id
	@Column(name="SupplierId")
	@GeneratedValue
	private Integer supId;
	@Column(name="SupplierName")
	private String supName;
	@Column(name="SupplierDescription")
	private String supDesc;
	public Integer getSupId() {
		return supId;
	}
	public void setSupId(Integer supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupDesc() {
		return supDesc;
	}
	public void setSupDesc(String supDesc) {
		this.supDesc = supDesc;
	}
}
