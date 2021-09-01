package fliticket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			File myObj = new File("C:\\Users\\technook\\Documents\\fliticket\\src\\fliticket\\poltronas.txt");
			Scanner myReader = new Scanner(myObj);
			Scanner reading = new Scanner(System.in);
			System.out.println("Your Name:");
			String userName = reading.nextLine();
			System.out.println("Your CPF:");
			String userCPF = reading.nextLine();
			System.out.println("Your Adress:");
			String userAddress = reading.nextLine();
			System.out.println("Your Age:");
			int userAge = reading.nextInt();
			User user = new User(userName, userCPF, userAge, userAddress);
			List<Poltrona> arrayPoltrona = new ArrayList();
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitter = data.split(",");
//				System.out.println("Poltrona: "+splitter[0]);
//				System.out.println("Status: "+splitter[1]);
//				System.out.println("Usuário: "+splitter[2]);
				boolean status = splitter[1] == "true"? true : false;
				Poltrona poltrona = new Poltrona(splitter[0], status, new User());
				
				arrayPoltrona.add(poltrona);
				//New Poltrona()...

			}
			
			System.out.println(arrayPoltrona.get(1).getUser().getName());
			arrayPoltrona.get(1).setUser(user);
			System.out.println(arrayPoltrona.get(1).getUser().toString());
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}


	}  


}
