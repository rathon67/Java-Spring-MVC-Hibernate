package com.rathon.myapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_page")
public class Layout {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name= "idMotor")
	private Integer idMotor;
	
	@Column(name="name")
	private String name;
	
	@Column(name="picture")
	private String picture;
	
	@Column(name="picture_detail")
	private String pictureDetail;
	
	@Column(name="picture_detail2")
	private String pictureDetail2;
	
	@Column(name="value")
	private Integer value;
	
	/*Getter and Setter/
	 * 
	 */
	
	

	public Integer getIdMotor() {
		return idMotor;
	}
	
	public void setIdMotor(Integer idMotor) {
		this.idMotor=idMotor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture=picture;
	}
	
	public String getPictureDetail() {
		return pictureDetail;
	}
	
	public void setPictureDetail(String pictureDetail) {
		this.pictureDetail=pictureDetail;
	}
	
	public String getPictureDetail2() {
		return pictureDetail2;
	}
	
	public void setPictureDetail2(String pictureDetail2) {
		this.pictureDetail2=pictureDetail2;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value=value;
	}
}
