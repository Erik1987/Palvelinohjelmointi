import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *  App is test version and not suitable for underage use
 *         Contains strong and vile language
 */
public class HookerCalculator2000 {

	public static void main(String[] args) throws IOException {

		// intro section and optimization
		System.out.println("Welcome to HookerCalculator2000");
		System.out.println("********************************\n********************************");
		System.out.print("Please type in your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("\nGreetings! " + name + "\n");
		String choice = null;
		int valinta = 0;
		try {
			do {
				System.out.print("Would you like to proceed? (yes/no): ");
				choice = scan.next();
			} while (!(choice.equalsIgnoreCase("yes")) && !(choice.equalsIgnoreCase("no")));

			if (choice.equalsIgnoreCase("no")) {
				System.out.println("\n***************************");
				System.out.println("Thank you for using this app, Goodbye!");
				System.exit(0);
			}
		}catch (Exception e) {
				System.out.println("Noooooooooo!!!!! You mongoloid, you crashed the system!");
			}
		
		do {
			
				
		valinta = kysyVaihtoehtoja(name);	
		
		switch (valinta) {
		case 1:
			//read, write or view hookers
			addHookersToMyList();
			break;
		case 2: 
			// add spent money on hookers, and see total spent money
			addSpentMoneyOnHookers();
			break;
		case 3: 
			// add or remove stds, view a list of stds
			showMyCurrentStds();
			break;
		case 4: 
			// show list of different viable stds and their medical information in ironic form
			showListOfStds();
			break;
		case 5: 
			// show various jokes with a randomizer
			ShowJokes();
			break;
		case 6:
			//terminate app
			System.out.println("\n***************************");
			System.out.println("Thank you for using this app, Goodbye!");
			System.exit(0);
		default:
			break;
		}
		}while (valinta != 6);
	}

	private static void ShowJokes() {
		int selection = 0;
		String filePath = null;
		
		selection = (int)(Math.random() * 4 +1);
		switch (selection) {
		case 1:
			 filePath = "C:\\Users\\John Doe\\eclipse-workspace\\Testi\\joke1.txt";
			break;
		case 2:
				filePath = "C:\\Users\\John Doe\\eclipse-workspace\\Testi\\joke2.txt";
			break;	
		case 3:
			 filePath = "C:\\Users\\John Doe\\eclipse-workspace\\Testi\\joke3.txt";
			break;
		case 4:
			filePath = "C:\\Users\\John Doe\\eclipse-workspace\\Testi\\joke4.txt";
			break;	
		default:
			break;
		}
		
		 
        System.out.println("\n" +readLineByLineJava8( filePath ) );
		
	}
	 private static String readLineByLineJava8(String filePath)
	    {
	        StringBuilder contentBuilder = new StringBuilder();
	 
	        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
	        {
	            stream.forEach(s -> contentBuilder.append(s).append("\n"));
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	 
	        return contentBuilder.toString();
	    }
	private static void showListOfStds() {
		String filePath = "C:\\Users\\John Doe\\eclipse-workspace\\Testi\\src\\stdList.txt";
		 
        System.out.println("\n" +readLineByLineJava8( filePath ) );
		
	}

	private static void showMyCurrentStds() {
		// TODO Auto-generated method stub
		
	}

	private static void addSpentMoneyOnHookers() throws IOException {
		
		  PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\John Doe\\eclipse-workspace\\Testi\\hookerCost.txt"));

	        Scanner scan = new Scanner(System.in);
	        System.out.println("********************************");
	        System.out.println("\nHere you can add cost of hookers and check total sum\n");
	        System.out.print("Exit (yes/no)? \n");
	        String text = ""; double sum = 0.00, single;
	        while (!text.equals("yes")) {
	            System.out.print("Add cost of your hooker: ");
	            text = scan.next();
	            if(text.matches("\\d+")) {
	            pw.write(text);
	            pw.println();
	            }
	            if(!text.equals("yes") && !text.equals("no")) {
	            single = Double.parseDouble(text);
	            sum = sum + single;
	            }
	            System.out.println("Total sum of hookers is " + sum);
	            System.out.print("Exit (yes/no)? ");
	            text = scan.next();
	        }
	        pw.close();
	        System.out.println("completed");
		
	}

	private static void addHookersToMyList() throws IOException {
		 PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\John Doe\\eclipse-workspace\\Testi\\hookersList.txt"));
		 PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\John Doe\\eclipse-workspace\\Testi\\currentStds.txt"));
	        Scanner scan = new Scanner(System.in);
	        System.out.println("********************************");
	        System.out.println("\nHere you can add hookers and STDs\n");
	        String text = ""; int counter = 1;
	        while (!text.equals("yes")) {
	            System.out.print("\nAdd " + counter +". hooker\n");
	            System.out.print("Name: ");
	            text = scan.nextLine();
	           // if (text.matches("\\w+")) {
					counter = counter + 1;
				//}
	            pw.write(counter +". Name: " +text);
	            pw.println();
	            
	            System.out.print("Possible STD: ");
	            text = scan.next();
	            if (text.matches("\\w+")) {
					pw2.write(text +", ");
				}
	            pw.write("STD: "+text);
	            pw.println();
	            System.out.println("");	           
	            System.out.print("Exit (yes/no)? ");
	            text = scan.next();
	            scan.nextLine();
	        }
	        pw.close();
	        pw2.close();
	        System.out.println("completed");
		
	}

	private static int kysyVaihtoehtoja(String name) {
		System.out.println("************************************\n");
		System.out.println(name + ", Choose what to do next?\n ");
		System.out.println("Add hookers to my list            (1) ");
		System.out.println("Add spent money on hookers        (2) ");
		System.out.println("Show my current STDs              (3) ");
		System.out.println("Show a list of STDs               (4) ");
		System.out.println("Show me a joke about prostitution (5) ");
		System.out.println("Exit                              (6)");
		System.out.print(name +", please select what to do: ");
		Scanner scan = new Scanner(System.in);
		int valinta = scan.nextInt();
		return valinta;
	}

}
