package Selenium_WebDriver;

public class T3__Xpath_Trasverse {

	public static void main(String[] args) {
		
		//  '/'  ---> from parent to child
		//  '/..'  ---> from child to parent
		
		//1 to kanthara
		//td[text()="1"]/../td[text()="Kanthara"]
		//1 to 2
		//td[text()="1"]/../td[text()="Kanthara"]/../../tr[2]/td[text()="2"]
		//1 to KGF
		//td[text()="1"]/../td[text()="Kanthara"]/../../tr[2]/td[text()="2"]/../td[contains(text(),"KGF")]
		//1 to 3
		//td[text()="1"]/../td[text()="Kanthara"]/../../tr[2]/td[text()="2"]/../td[contains(text(),"KGF")]/../../tr[3]/td[text()="3"]
		//kanthara to RRR
		//td[text()="Kanthara"]/../..//td[text()="RRR"]                   or
		//td[text()="Kanthara"]/../../tr[3]/td[text()="RRR"]
		//20 cr to 1
		//td[.="20cr"]/../../tr[1]/td[1]
		
		//folllowing sibling   -  from elder to younger/forward
		//1 to 10cr
		//td[.="1"]/following-sibling::td[.="10cr"]
		//::sscope resolution
		//preceding sibling  -  from younger to elder/backward
		//10 cr to Kanthara
		//td[.="10cr"]/preceding-sibling::td[1]
		//10 cr to 1
		//td[.="10cr"]/preceding-sibling::td[2]
		
		//practice
		////td[1]/../td[2]/../../tr[2]/td[2]/../../tr[1]/td[1]//following-sibling::td[2]//preceding-sibling::td[2]
		

	}

}