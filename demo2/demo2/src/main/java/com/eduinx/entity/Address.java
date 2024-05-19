package com.eduinx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private int aid;
    private String city;

    public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
