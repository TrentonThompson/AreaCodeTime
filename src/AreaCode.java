import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
public class AreaCode {
/**
 * Here I create an Area code finder application.
 * Trenton Thompson
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 digit Area Code");
		int areacode = input.nextInt();
		
		switch(areacode){
		//Alabama Area codes: Central Standard times
		case 205: case 251: case 256: case 334:
			Calendar alabamadate = Calendar.getInstance();
			DateFormat formatter1 = new SimpleDateFormat("MM-dd-yyyy h:mm a");
			TimeZone obj1 = TimeZone.getTimeZone("CST");
			formatter1.setTimeZone(obj1);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter1.format(alabamadate.getTime()));
			break;
			
			//Alaska Area Code: Alaska Time 
		case 907:
			Calendar alaskadate = Calendar.getInstance();
			DateFormat formatter2 = new SimpleDateFormat("MM-dd-yyyy h:mm a");
			TimeZone obj2 = TimeZone.getTimeZone("AST");
			formatter2.setTimeZone(obj2);
		
			System.out.println("Current Date and Alaska Time is: "+ formatter2.format(alaskadate.getTime()));
			break;
			
			//Arizona Area Code: Mountain Time -1 hour ///Arizona Never Changes Time///Stays same always//
	    case 480: case 520: case 602: case 623: case 928:
			Calendar arizonadate = Calendar.getInstance();
			DateFormat formatter3 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj3 = TimeZone.getTimeZone("US/Arizona");
			formatter3.setTimeZone(obj3);
		
			System.out.println("Current Date and Arizona Time is: "+ formatter3.format(arizonadate.getTime()));
			break;
			
			//Arkansas Area Code: Central Time
	    case 479: case 501: case 870:
	    	Calendar arkansasdate = Calendar.getInstance();
			DateFormat formatter4 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj4 = TimeZone.getTimeZone("CST");
			formatter4.setTimeZone(obj4);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter4.format(arkansasdate.getTime()));
			break;
			
			//California Area Code: Pacific Time
	    case 209: case 559: case 213: case 310: case 323: case 562:
	    case 626: case 661: case 805: case 818: case 408: case 510:
	    case 650: case 925: case 831: case 415: case 424: case 707:
	    case 530: case 714: case 909: case 949: case 951: case 619:
	    case 760: case 858: case 916:
	    	Calendar californiadate = Calendar.getInstance();
			DateFormat formatter5 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj5 = TimeZone.getTimeZone("PST");
			formatter5.setTimeZone(obj5);
		
			System.out.println("Current Date and Pacific Standard Time is: "+ formatter5.format(californiadate.getTime()));
			break;
			
			// Colorado : Mountain Time
			
	    case 303: case 720: case 970: case 719:
	    	Calendar coloradodate = Calendar.getInstance();
			DateFormat formatter6 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj6 = TimeZone.getTimeZone("MST");
			formatter6.setTimeZone(obj6);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter6.format(coloradodate.getTime()));
			break;
			
			// Connecticut Area Codes : Eastern Time

	    case 203: case 860: case 475: case 959:
	    	Calendar connecticutdate = Calendar.getInstance();
			DateFormat formatter7 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj7 = TimeZone.getTimeZone("EST");
			formatter7.setTimeZone(obj7);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter7.format(connecticutdate.getTime()));
			break;
			
			// District of Columbia DC : Eastern Time
			
	    case 202: case 703:
	    	Calendar dcdate = Calendar.getInstance();
			DateFormat formatter8 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj8 = TimeZone.getTimeZone("EST");
			formatter8.setTimeZone(obj8);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter8.format(dcdate.getTime()));
			break;
			
			// Delaware DE : Eastern Time 
			
	    case 302: 
	    	Calendar delawaredate = Calendar.getInstance();
			DateFormat formatter9 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj9 = TimeZone.getTimeZone("EST");
			formatter9.setTimeZone(obj9);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter9.format(delawaredate.getTime()));
			break;
			
			// Florida FL : Eastern Time
			
	    case 239: case 305: case 786: case 321: case 407: case 863:
	    case 772: case 352: case 386: case 561: case 754: case 954:
	    case 727: case 813: case 850: case 904: case 941:
	    	Calendar floridadate = Calendar.getInstance();
			DateFormat formatter10 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj10 = TimeZone.getTimeZone("EST");
			formatter10.setTimeZone(obj10);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter10.format(floridadate.getTime()));
			break;
			
			 // Georgia : Eastern Time

	    case 229: case 404: case 470: case 678: case 770: case 478:
	    case 912: case 706:
	    	Calendar georgiadate = Calendar.getInstance();
			DateFormat formatter11 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj11 = TimeZone.getTimeZone("EST");
			formatter11.setTimeZone(obj11);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter11.format(georgiadate.getTime()));
			break;
			
			// Hawaii : Hawaii Time 
			
	    case 808:
	    	Calendar hawaiidate = Calendar.getInstance();
			DateFormat formatter12 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj12 = TimeZone.getTimeZone("HST");
			formatter12.setTimeZone(obj12);
		
			System.out.println("Current Date and Hawaii Standard Time is: "+ formatter12.format(hawaiidate.getTime()));
			break;
			
			// Iowa : Central Time
			
	    case 319: case 641: case 515: case 563: case 712:
	    	Calendar iowadate = Calendar.getInstance();
			DateFormat formatter13 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj13 = TimeZone.getTimeZone("CST");
			formatter13.setTimeZone(obj13);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter13.format(iowadate.getTime()));
			break;
			
			// Idaho Area Code : Mountain Time
			
		case 208:
			Calendar idahodate = Calendar.getInstance();
			DateFormat formatter14 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj14 = TimeZone.getTimeZone("MST");
			formatter14.setTimeZone(obj14);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter14.format(idahodate.getTime()));
			break;
			
			// Illinois : Central Time
			
		case 217: case 224: case 312: case 630: case 847: case 309: 
		case 815: case 708: case 773: case 779: case 618: case 331:
			Calendar illinoisdate = Calendar.getInstance();
			DateFormat formatter15 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj15 = TimeZone.getTimeZone("CST");
			formatter15.setTimeZone(obj15);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter15.format(illinoisdate.getTime()));
			break;
			
			//Indiana IN : Central Time	
		    
		case 219:
			Calendar indianadate = Calendar.getInstance();
			DateFormat formatter16 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj16 = TimeZone.getTimeZone("CST");
			formatter16.setTimeZone(obj16);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter16.format(indianadate.getTime()));
			break;
			
			//Indiana IN : Eastern Time   
			
		case 260: case 317: case 765: case 574: case 812:
			Calendar indianadate1 = Calendar.getInstance();
			DateFormat formatter17 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj17 = TimeZone.getTimeZone("EST");
			formatter17.setTimeZone(obj17);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter17.format(indianadate1.getTime()));
			break;
			
			//Kansas KS : Central Time
			
		case 316: case 620: case 785: case 913:
			Calendar kansasdate = Calendar.getInstance();
			DateFormat formatter18 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj18 = TimeZone.getTimeZone("CST");
			formatter18.setTimeZone(obj18);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter18.format(kansasdate.getTime()));
			break;
			
			//Kentucky KY : Eastern Time
			
		case 270: case 502: case 606: case 859:
			Calendar kentuckydate = Calendar.getInstance();
			DateFormat formatter19 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj19 = TimeZone.getTimeZone("EST");
			formatter19.setTimeZone(obj19);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter19.format(kentuckydate.getTime()));
			break;
			
			// Louisiana LA : Central Time
		    
		case 225: case 318: case 337: case 985: case 504:
			Calendar louisianadate = Calendar.getInstance();
			DateFormat formatter20 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj20 = TimeZone.getTimeZone("CST");
			formatter20.setTimeZone(obj20);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter20.format(louisianadate.getTime()));
			break;
			
			// Massachussetts MA : Eastern Time	

		case 339: case 508: case 617: case 774: case 781: 
		case 857: case 978: case 351: case 413:
			Calendar massdate = Calendar.getInstance();
			DateFormat formatter21 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj21 = TimeZone.getTimeZone("EST");
			formatter21.setTimeZone(obj21);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter21.format(massdate.getTime()));
			break;
			
			//Maryland MD : Eastern Time 
		    
		case 240: case 301: case 410: case 866: case 443:
			Calendar marylanddate = Calendar.getInstance();
			DateFormat formatter22 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj22 = TimeZone.getTimeZone("EST");
			formatter22.setTimeZone(obj22);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter22.format(marylanddate.getTime()));
			break;
			
			// Maine ME : Eastern Time	   

		case 207:
			Calendar mainedate = Calendar.getInstance();
			DateFormat formatter23 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj23 = TimeZone.getTimeZone("EST");
			formatter23.setTimeZone(obj23);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter23.format(mainedate.getTime()));
			break;
			
			// Michigan MI : Eastern Time
			
		case 231: case 248: case 313: case 586: case 734: case 810: case 947:
		case 269: case 616: case 517: case 906: case 989:
			Calendar michigandate = Calendar.getInstance();
			DateFormat formatter24 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj24 = TimeZone.getTimeZone("EST");
			formatter24.setTimeZone(obj24);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter24.format(michigandate.getTime()));
			break;
			
			// Minnesota MN : Central Time 
			
		case 218: case 320: case 507: case 651: case 612: case 763: case 952:
			Calendar minnesotadate = Calendar.getInstance();
			DateFormat formatter25 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj25 = TimeZone.getTimeZone("CST");
			formatter25.setTimeZone(obj25);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter25.format(minnesotadate.getTime()));
			break;
			
			//Missouri MO : Central Time 
		    
		case 314: case 636: case 417: case 573: case 660: case 816:
			Calendar missouridate = Calendar.getInstance();
			DateFormat formatter26 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj26 = TimeZone.getTimeZone("CST");
			formatter26.setTimeZone(obj26);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter26.format(missouridate.getTime()));
			break;
			
			//Mississippi MS : Central Time

		case 228: case 601: case 662:
			Calendar missdate = Calendar.getInstance();
			DateFormat formatter27 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj27 = TimeZone.getTimeZone("CST");
			formatter27.setTimeZone(obj27);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter27.format(missdate.getTime()));
			break;
			
			//Montana MT : Mountain Time 
			
		case 406:
			Calendar montanadate = Calendar.getInstance();
			DateFormat formatter28 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj28 = TimeZone.getTimeZone("MST");
			formatter28.setTimeZone(obj28);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter28.format(montanadate.getTime()));
			break;
			
			//North Carolina NC : Eastern Time
			
		case 252: case 910: case 919: case 336: case 704: case 828: case 980:
			Calendar ncdate = Calendar.getInstance();
			DateFormat formatter29 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj29 = TimeZone.getTimeZone("EST");
			formatter29.setTimeZone(obj29);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter29.format(ncdate.getTime()));
			break;
			
			//North Dakota ND : Central Time
			
		case 701:
			Calendar nddate = Calendar.getInstance();
			DateFormat formatter30 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj30 = TimeZone.getTimeZone("CST");
			formatter30.setTimeZone(obj30);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter30.format(nddate.getTime()));
			break;
			
			//Nebraska Area Codes: Central Time
			
		case 308: case 402:
			Calendar nebdate = Calendar.getInstance();
			DateFormat formatter31 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj31 = TimeZone.getTimeZone("CST");
			formatter31.setTimeZone(obj31);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter31.format(nebdate.getTime()));
			break;
			
			//New Hampshire NH : Eastern Time
			
		case 603:
			Calendar nhdate = Calendar.getInstance();
			DateFormat formatter32 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj32 = TimeZone.getTimeZone("EST");
			formatter32.setTimeZone(obj32);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter32.format(nhdate.getTime()));
			break;
			
			//New Jersey NJ : Eastern Time
			
		case 201: case 551: case 908: case 973: case 732: case 862: case 609:
		case 856: case 848:
			Calendar njdate = Calendar.getInstance();
			DateFormat formatter33 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj33 = TimeZone.getTimeZone("EST");
			formatter33.setTimeZone(obj33);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter33.format(njdate.getTime()));
			break;
			
			 //New Mexico NM : Mountain Time
			
		case 505: case 575:
			Calendar nmdate = Calendar.getInstance();
			DateFormat formatter34 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj34 = TimeZone.getTimeZone("MST");
			formatter34.setTimeZone(obj34);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter34.format(nmdate.getTime()));
			break;
			
			//Nevada Area Codes : Pacific Time

		case 702: case 775:
			Calendar nevadadate = Calendar.getInstance();
			DateFormat formatter35 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj35 = TimeZone.getTimeZone("PST");
			formatter35.setTimeZone(obj35);
		
			System.out.println("Current Date and Pacific Standard Time is: "+ formatter35.format(nevadadate.getTime()));
			break;
			
			//New York Area Codes: Eastern Time
			
		case 212: case 347: case 646: case 718: case 917: case 315: case 516: case 631: case 518: case 585:
		case 716: case 607: case 845: case 914:
			Calendar newyorkdate = Calendar.getInstance();
			DateFormat formatter36 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj36 = TimeZone.getTimeZone("EST");
			formatter36.setTimeZone(obj36);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter36.format(newyorkdate.getTime()));
			break;
			
			//Ohio Area Codes: Eastern Time  
			
		case 216: case 440: case 234: case 330: case 740: case 419: case 567: case 513: case 614: case 937:
			Calendar ohiodate = Calendar.getInstance();
			DateFormat formatter37 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj37 = TimeZone.getTimeZone("EST");
			formatter37.setTimeZone(obj37);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter37.format(ohiodate.getTime()));
			break;
			
			//Oklahoma Area Codes : Central Time
			
		case 405: case 580: case 918:
			Calendar oklahomadate = Calendar.getInstance();
			DateFormat formatter38 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj38 = TimeZone.getTimeZone("CST");
			formatter38.setTimeZone(obj38);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter38.format(oklahomadate.getTime()));
			break;
			
			//Oregon Area Codes: Pacific Time
			
		case 503: case 971: case 541:
			Calendar oregondate = Calendar.getInstance();
			DateFormat formatter39 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj39 = TimeZone.getTimeZone("PST");
			formatter39.setTimeZone(obj39);
		
			System.out.println("Current Date and Pacific Standard Time is: "+ formatter39.format(oregondate.getTime()));
			break;
			
			//Pennsylvania Area Codes : Eastern Time
			
		case 215: case 267: case 484: case 610: case 412: case 724: case 570: case 717: case 814:
			Calendar penndate = Calendar.getInstance();
			DateFormat formatter40 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj40 = TimeZone.getTimeZone("EST");
			formatter40.setTimeZone(obj40);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter40.format(penndate.getTime()));
			break;
			
			//Puerto Rico Area Codes : Central Time
			
		case 787: case 939:
			Calendar prdate = Calendar.getInstance();
			DateFormat formatter41 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj41 = TimeZone.getTimeZone("CST");
			formatter41.setTimeZone(obj41);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter41.format(prdate.getTime()));
			break;
			
			//Rhode Island Area Code :  Eastern Time

		case 401:
			Calendar ridate = Calendar.getInstance();
			DateFormat formatter42 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj42 = TimeZone.getTimeZone("EST");
			formatter42.setTimeZone(obj42);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter42.format(ridate.getTime()));
			break;
			
			//South Carolina : Eastern Time
			
		case 803: case 843: case 864:
			Calendar scdate = Calendar.getInstance();
			DateFormat formatter43 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj43 = TimeZone.getTimeZone("EST");
			formatter43.setTimeZone(obj43);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter43.format(scdate.getTime()));
			break;
			
			// South Dakota Area Code : Central Time

		case 604: case 605:
			Calendar sddate = Calendar.getInstance();
			DateFormat formatter44 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj44 = TimeZone.getTimeZone("CST");
			formatter44.setTimeZone(obj44);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter44.format(sddate.getTime()));
			break;
			
			//Tennesse Area Codes: Eastern Time
			
		case 423: case 865:
			Calendar tenndate = Calendar.getInstance();
			DateFormat formatter45 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj45 = TimeZone.getTimeZone("EST");
			formatter45.setTimeZone(obj45);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter45.format(tenndate.getTime()));
			break;
			
			//Tennesse Area Codes: Central time
			
		case 615: case 931: case 731: case 901:
			Calendar tenndate1 = Calendar.getInstance();
			DateFormat formatter46 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj46 = TimeZone.getTimeZone("CST");
			formatter46.setTimeZone(obj46);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter46.format(tenndate1.getTime()));
			break;
			
			 //Texas Area Codes: Central Time
			
		case 210: case 830: case 214: case 469: case 682: case 817: case 972: case 254: case 281: case 713:
		case 832: case 936: case 325: case 432: case 361: case 409: case 430: case 903: case 806: case 915:
		case 512: case 940: case 956: case 979:
			Calendar texasdate = Calendar.getInstance();
			DateFormat formatter47 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj47 = TimeZone.getTimeZone("CST");
			formatter47.setTimeZone(obj47);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter47.format(texasdate.getTime()));
			break;
			
			//Utah Area Codes: Mountain Time
			
		case 801: case 435: case 385:
			Calendar utahdate = Calendar.getInstance();
			DateFormat formatter48 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj48 = TimeZone.getTimeZone("MST");
			formatter48.setTimeZone(obj48);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter48.format(utahdate.getTime()));
			break;
			
			//Virginia Area Codes: Eastern Time
			
		case 276: case 434: case 540: case 571: case 757: case 804:
			Calendar virginiadate = Calendar.getInstance();
			DateFormat formatter49 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj49 = TimeZone.getTimeZone("EST");
			formatter49.setTimeZone(obj49);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter49.format(virginiadate.getTime()));
			break;
			
			//Vermont Area Code : Eastern Time
			
		case 802:
			Calendar vermontdate = Calendar.getInstance();
			DateFormat formatter50 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj50 = TimeZone.getTimeZone("EST");
			formatter50.setTimeZone(obj50);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter50.format(vermontdate.getTime()));
			break;
			
			//Washington Area Code : Pacific Time
			
		case 206: case 253: case 360: case 425: case 509:
			Calendar washdate = Calendar.getInstance();
			DateFormat formatter51 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj51 = TimeZone.getTimeZone("PST");
			formatter51.setTimeZone(obj51);
		
			System.out.println("Current Date and Pacific Standard Time is: "+ formatter51.format(washdate.getTime()));
			break;
			
			//Wisconsin Area Code : Central Time
			
		case 262: case 414: case 920: case 608: case 715:
			Calendar wiscdate = Calendar.getInstance();
			DateFormat formatter52 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj52 = TimeZone.getTimeZone("CST");
			formatter52.setTimeZone(obj52);
		
			System.out.println("Current Date and Central Standard Time is: "+ formatter52.format(wiscdate.getTime()));
			break;
			
			//West Virginia Area Code : Eastern Time
			
		case 304:
			Calendar wvdate = Calendar.getInstance();
			DateFormat formatter53 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj53 = TimeZone.getTimeZone("EST");
			formatter53.setTimeZone(obj53);
		
			System.out.println("Current Date and Eastern Standard Time is: "+ formatter53.format(wvdate.getTime()));
			break;
			
			//Wyoming Area Code : Mountain Time
			
		case 307:
			Calendar wydate = Calendar.getInstance();
			DateFormat formatter54 = new SimpleDateFormat("dd-MM-yyyy h:mm a");
			TimeZone obj54 = TimeZone.getTimeZone("MST");
			formatter54.setTimeZone(obj54);
		
			System.out.println("Current Date and Mountain Standard Time is: "+ formatter54.format(wydate.getTime()));
			break;
			
			default: 
				System.out.println("Current Date and Time Zone Unknown ");
				
				
		}
		
      input.close();
     
	}

}
