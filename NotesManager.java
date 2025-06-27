package elevatelabs;



	import java.io.*;
	import java.util.Scanner;

	public class NotesManager {
	    private static final String FILE_NAME = "notes.txt";

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Add Note");
	            System.out.println("2. View Notes");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();
	            scanner.nextLine(); // Consume newline left-over

	            switch (option) {
	                case 1:
	                    addNote(scanner);
	                    break;
	                case 2:
	                    viewNotes();
	                    break;
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid option");
	            }
	        }
	    }

	    private static void addNote(Scanner scanner) {
	        System.out.print("Enter your note: ");
	        String note = scanner.nextLine();
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
	            writer.write(note);
	            writer.newLine();
	            System.out.println("Note added successfully");
	        } catch (IOException e) {
	            System.out.println("Error adding note: " + e.getMessage());
	        }
	    }

	    private static void viewNotes() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            int noteNumber = 1;
	            while ((line = reader.readLine()) != null) {
	                System.out.println("Note " + noteNumber + ": " + line);
	                noteNumber++;
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("No notes available");
	        } catch (IOException e) {
	            System.out.println("Error viewing notes: " + e.getMessage());
	        }
	    }
	}


	
