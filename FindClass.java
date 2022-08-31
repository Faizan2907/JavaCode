import java.io.*;

public class FindClass{
	public static String findClass(String str){
		int index = str.indexOf('.');
		String sub = str.substring(0, index);
		
		int octet = Integer.parseInt(sub);
			
		if(octet >= 0 && octet <= 127)
			return "A";
			
		else if(octet >= 128 && octet <= 191)			
			return "B";
			
		else if (octet>=192 && octet<223)
            		return "C";
        	
        	else if (octet >=224 && octet<=239)
            		return "D";
            		
            	else 
            		return "E";
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter an 32bit IP address in Decimal format with seperate dot(.) after each 8bit");
		String ip = bf.readLine();
		
		String classname = findClass(ip);
		String[] string = ip.split("\\.");
		
		System.out.println("Here are the details of the IP "+ ip +" entered by you.");
		System.out.println();
		System.out.println("IP address belongs to class : "+classname);
		switch(classname){
			case "A":
				System.out.println("Network ID : " + string[0] );
				System.out.println("Host ID : " + string[1] + "." + string[2] + "." + string[3]);
				break;
			
			case "B":
				System.out.println("Network ID : " + string[0] + "." + string[1]);
				System.out.println("Host ID : " + string[2] + "." + string[3]);
				break;
			
			case "C":
				System.out.println("Network ID : " + string[0] + "." + string[1] + "." + string[2]);
				System.out.println("Host ID : " + string[3]);
				break;

			case "D":
				System.out.println("Network ID : " + string[0] + "." + string[1] + "." + string[2] + "." + string[3]);
				break;
							
			case "E":
				System.out.println("Network ID : " + string[0] + "." + string[1] + "." + string[2] + "." + string[3]);
				break;
							
			default:
				System.out.println("Oops something went wrong ... ");
		}	
	}
}
