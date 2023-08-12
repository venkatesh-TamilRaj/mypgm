package com.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public static WebDriver Driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id ="password") 
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy (id="location")
	private WebElement location; 
	@FindBy (id="hotels")
	private WebElement hotel; 
	@FindBy (id="room_type")
	private WebElement Room; 
	@FindBy (id="room_nos")
	private WebElement Rno; 
	@FindBy (id="adult_room")
	private WebElement Adult; 
	@FindBy (id="child_room")
	private WebElement child;
	@FindBy (id="Submit")
	private WebElement Submit;
	@FindBy (id="radiobutton_0")
	private WebElement radio;
	@FindBy (id="continue")
	private WebElement continueB;
	@FindBy (id="first_name")
	private WebElement fname;
	@FindBy (id="last_name")
	private WebElement lname;
	@FindBy (id="address")
	private WebElement address;
	@FindBy (id="cc_num")
	private WebElement cc_num;
	@FindBy (id="cc_type")
	private WebElement cctype;
	@FindBy (id="cc_exp_month")
	private WebElement exp;
	@FindBy (id="cc_exp_year")
	private WebElement year;
	@FindBy (id="cc_cvv")
	private WebElement cvv;
	@FindBy (id="book_now")
	private WebElement booknow;
	@FindBy (id="my_itinerary")
	private WebElement itinerary;
	@FindBy (id="logout")
	private WebElement logout;
	
	
	
	
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getExp() {
		return exp;
	}
	public WebElement getCctype() {
	return cctype;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getContinueB() {
		return continueB;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return Room;
	}
	public WebElement getRno() {
		return Rno;
	}
	public WebElement getAdult() {
		return Adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getLocation() {
		
		return location;
	}

	public loginpage(WebDriver Driver) {
		this.Driver= Driver;
		PageFactory.initElements(Driver, this);
		// TODO Auto-generated constructor stub
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}
