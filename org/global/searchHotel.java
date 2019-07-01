package org.global;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel extends BaseClass {
public searchHotel() {
	PageFactory.initElements(driver, this);
		
}
@FindBy(id="location") private WebElement location;
@FindBy(id="hotels") private WebElement hotel;
@FindBy(id="room_type") private WebElement roomtype;
@FindBy(id="room_nos") private WebElement roomno;
@FindBy(id="datepick_in") private WebElement datein;
@FindBy(id="datepick_out") private WebElement dateout;
@FindBy(id="adult_room") private WebElement adultroom;
@FindBy(id="child_room") private WebElement childroom;
@FindBy(id="submit") private  WebElement btnclick;

public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getDatein() {
	return datein;
}
public WebElement getDateout() {
	return dateout;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}
public WebElement getSearch() {
	return searchbtn;
}


}
