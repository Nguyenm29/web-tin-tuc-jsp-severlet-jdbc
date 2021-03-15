package com.laptrinhjavaweb.model;

import java.security.Timestamp;

public class abstractModel {
	private Long id;
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private String createdBy;
	private String modifiedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	@Override
	public String toString() {
		return "abstractModel [id=" + id + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + "]";
	}
	
	
	
}
