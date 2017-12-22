package com.mix.problem;

public class campusmind
{
private int  Mid;
private String name;
private int phone;
private String track;
public campusmind(int mid, String name, int phone, String track) {
	Mid = mid;
	this.name = name;
	this.phone = phone;
	this.track = track;
}
public int getMid()
	{
	return Mid;
	}
public void setMid(int mid)
	{
	Mid = mid;
	}
public String getName() 
	{
	return name;
	}
public void setName(String name) 
	{
	this.name = name;
	}
public int getPhone()
	{
	return phone;
	}
public void setPhone(int phone) 
	{
	this.phone = phone;
	}
public String getTrack()
	{
	return track;
	}
public void setTrack(String track)
	{
	this.track = track;
	}
}
