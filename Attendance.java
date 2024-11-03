import java.util.Scanner;
public class Attendance {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int attendance;
		String[]  initials = new String[6];
			for(int i =1;  i<=5; i++) {
				
			
			while (true){	
			System.out.println("Enter attendence for students: 1: Present, 2: Absent, 3: Tardy");
			attendance = reader.nextInt();
			if(attendance>=1 && attendance<=3){
				break;
				}
				else {
					System.out.println("Invalid input. Enter 1, 2, or 3 for attendance.");
				}
			}
			reader.nextLine();
			
			//gets and checks if the initials input is valid
			while(true) {
				System.out.println("Enter initials for next student(two letters):");
				initials[i] = reader.nextLine();
				 if (initials[i].matches("[a-zA-Z]{2}")) {
		                System.out.println("Attendance for " + initials[i] + " : " + attendanceStatus(attendance) );
		                System.out.println("");
		                break;  // Exit the loop if valid input is received
		            } 
				 else {
		                System.out.println("Invalid input. Please enter only letters.");
		            }
		        }
			}	
			reader.close();
	}
	private static String attendanceStatus(int status) {
		
				switch(status) {
				case 1:
					return "Present";
				case 2:
					return "Absent";
				case 3:
					return "Tardy";
				default:
					return "Unknown";//this will never happen because we checked this in the earlier method
				}
				

				
				
				
			
			}
		
		
	}



