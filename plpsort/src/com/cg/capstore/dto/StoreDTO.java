package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class StoreDTO {
	@Id
	@Column(name="prod_id")
	String productId;
	
	@Column(name="prod_name")
	String productName;
	
	@Column(name="description")
	String productDesc;
	
	@Column(name="category_id")
	String categoryId;
	
	@Column(name="merchant_id")
	String merchantId;
	
	@Column(name="price")
	Integer productPrice;
	
	@Column(name="qty_available")
	Integer productQuantity;
	
	@Column(name="qty_supplied")
	Integer quantitySupplied;	
	
	@Column(name="subcategory_id")
	String subcategoryId;
	
	@Column(name="rating")
	Integer rating;	
	
	@Column(name="merchant_userid")
	Integer merchantUserId;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result
				+ ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result
				+ ((merchantUserId == null) ? 0 : merchantUserId.hashCode());
		result = prime * result
				+ ((productDesc == null) ? 0 : productDesc.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result
				+ ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result
				+ ((productQuantity == null) ? 0 : productQuantity.hashCode());
		result = prime
				* result
				+ ((quantitySupplied == null) ? 0 : quantitySupplied.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result
				+ ((subcategoryId == null) ? 0 : subcategoryId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreDTO other = (StoreDTO) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (merchantId == null) {
			if (other.merchantId != null)
				return false;
		} else if (!merchantId.equals(other.merchantId))
			return false;
		if (merchantUserId == null) {
			if (other.merchantUserId != null)
				return false;
		} else if (!merchantUserId.equals(other.merchantUserId))
			return false;
		if (productDesc == null) {
			if (other.productDesc != null)
				return false;
		} else if (!productDesc.equals(other.productDesc))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice == null) {
			if (other.productPrice != null)
				return false;
		} else if (!productPrice.equals(other.productPrice))
			return false;
		if (productQuantity == null) {
			if (other.productQuantity != null)
				return false;
		} else if (!productQuantity.equals(other.productQuantity))
			return false;
		if (quantitySupplied == null) {
			if (other.quantitySupplied != null)
				return false;
		} else if (!quantitySupplied.equals(other.quantitySupplied))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (subcategoryId == null) {
			if (other.subcategoryId != null)
				return false;
		} else if (!subcategoryId.equals(other.subcategoryId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreDTO [productId=" + productId + ", productName="
				+ productName + ", productDesc=" + productDesc
				+ ", categoryId=" + categoryId + ", merchantId=" + merchantId
				+ ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", quantitySupplied=" + quantitySupplied
				+ ", subcategoryId=" + subcategoryId + ", rating=" + rating
				+ ", merchantUserId=" + merchantUserId + "]";
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Integer getQuantitySupplied() {
		return quantitySupplied;
	}

	public void setQuantitySupplied(Integer quantitySupplied) {
		this.quantitySupplied = quantitySupplied;
	}

	public String getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(String subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(Integer merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	
	
	
	
	
}