package org.adac;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinExcel extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException  {
		browserLaunch("https://adactinhotelapp.com/");
		maximize();
		WebElement username = locators("id", "username");
		enterText(username,readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 0, 1));
		WebElement password = locators("id", "password");
		enterText(password, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 1, 1));
		WebElement login = locators("id", "login");
		click(login);
		Thread.sleep(3000);
		WebElement location = locators("name", "location");
		click(location);
		dropDownVisibleText(location, "Melbourne");
		
		WebElement hotels = locators("name", "hotels");
		click(hotels);
		dropDownVisibleText(hotels, "Hotel Hervey");
		
		WebElement roomtype = locators("name", "room_type");
		click(roomtype);
		dropDownVisibleText(roomtype, "Standard");
		
		WebElement roomnos = locators("name", "room_nos");
		click(roomnos);
		dropDownVisibleText(roomnos, "2 - Two");
		
		WebElement checkin = locators("name", "datepick_in");
		enterText(checkin, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 2, 1));
		
		WebElement checkout = locators("name", "datepick_out");
		enterText(checkout, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 3, 1));
		
		WebElement adult = locators("name", "adult_room");
		click(adult);
		dropDownVisibleText(adult, "2 - Two");
		
		WebElement child= locators("name", "child_room");
		click(child);
		dropDownVisibleText(child, "1 - One");
		
		WebElement search = locators("id", "Submit");
		click(search);
		
		Thread.sleep(3000);
		
		WebElement radiobtn = locators("name", "radiobutton_0");
		click(radiobtn);
		
		WebElement continuebtn = locators("name", "continue");
		click(continuebtn);
		
		Thread.sleep(3000);
		
		WebElement firstname = locators("name", "first_name");
		enterText(firstname, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 4, 1));
		WebElement lastname = locators("name", "last_name");
		enterText(lastname, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 5, 1));
		WebElement address = locators("name", "address");
		enterText(address, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 6, 1));
		WebElement cardnum = locators("name", "cc_num");
		enterText(cardnum, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 7, 1));
		WebElement cardtype = locators("name", "cc_type");
		click(cardtype);
		dropDownVisibleText(cardtype, "VISA");
		WebElement expmonth = locators("name", "cc_exp_month");
		click(expmonth);
		dropDownVisibleText(expmonth, "October");
		
		WebElement expyear = locators("name", "cc_exp_year");
		click(expyear);
		dropDownVisibleText(expyear, "2022");
		
		WebElement cvv = locators("name", "cc_cvv");
		enterText(cvv, readExcel("E:\\Guru Java Softwares\\FrameWork\\Adactindata.xlsx", "Adactin", 8, 1));
		
		WebElement booknow = locators("name", "book_now");
		click(booknow);
		Thread.sleep(5000);
		
		WebElement orderno = locators("id", "order_no");
		String attribute = getAttribute(orderno, "value");
		System.out.println(attribute);
		
		screenshot("E:\\Guru Java Softwares\\screenshot\\adactin.png");
}
}