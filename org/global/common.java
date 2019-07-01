package org.global;

import org.openqa.selenium.WebDriver;

public class common extends BaseClass {

public static void main(String[] args) {
	 getDriver();
	loadUrl("https://adactin.com/hotelapp/");
	LoginPage page=new LoginPage();
	type(page.getUsername(),"ramya12345");
	type(page.getPassword(),"chennai");
	btnclick(page.getBtnclick());
	searchHotel page1=new searchHotel();
	type(page1.getLocation(),"Sydney");
	type(page1.getHotel(),"HotelCreek");
	type(page1.getRoomtype(),"Deluxe");
	type(page1.getRoomno(),"2");
	type(page1.getDatein(),"20/07/2019");
	type(page1.getDateout(),"22/07/2019");
	type(page1.getAdultroom(),"2");
	type(page1.getChildroom(),"1");
}
}
