package com.shopping.ShoppingCartFinal.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name = "CategoryId")
	@GeneratedValue
	private Integer catId;
	@Column(name = "CategoryName")
	private String catName;
	@Column(name = "CategoryDescription")
	private String catDesc;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(
			name="CategoryItem",
			joinColumns = @JoinColumn(name="CATEGORY_ID"),
			inverseJoinColumns = @JoinColumn(name="PRODUCT_ID")
			)

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
}
