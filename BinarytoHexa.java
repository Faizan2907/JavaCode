import java.io.*;
public class BinarytoHexa{
	public static void main(String args[])throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		 

		System.out.println("Please enter an 32bit IP address in Binary format with seperate dot(.) after each 8bit");
		String ip = reader.readLine();
		String[] string = ip.split("\\.");
		
		System.out.println("IP Address in Hexa - Decimal format : ");
		for(String binary:string){
			int decimal = Integer.parseInt(binary, 2);
			String hexa = Integer.toHexString(decimal);
			System.out.print(hexa + ".");
		}
		System.out.println();
	}
}

