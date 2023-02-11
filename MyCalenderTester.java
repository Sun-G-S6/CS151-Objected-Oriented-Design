package cs151ProgramAssignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class MyCalenderTester {
	
	
	        public static void main(String [] args)
	        {
	                LocalDate cal = LocalDate.now(); // capture today
	                Scanner sc = new Scanner(System.in);
	                //System.out.print("Today: ");

	                printCalendar(cal);

	                while (sc.hasNextLine())
	                {
	                        String input = sc.nextLine();
	                        if (input.equals("p"))
	                        {
	                                cal = cal.minusMonths(1); // LocalDateTime is immutable
	                                printCalendar(cal);
	                        }
	                        else if (input.equals("n"))
	                        {
	                                cal = cal.plusMonths(1); // LocalDateTime is immutable
	                                printCalendar(cal);
	                                
	                        }
	                }
	                System.out.println("Bye!");
	        }
	        public static void printCalendar(LocalDate c)
	        {  
	            //System.out.print(c.getDayOfWeek());
	            //System.out.print(c.getDayOfMonth());
	            System.out.print("\t" + c.getMonth());
	            System.out.print(" ");
	            System.out.println(c.getYear());
	            String header = "Sun\tMon\tTue\tWed\tThu\tFri\tSat";
	            System.out.println(header);
	           	
				LocalDate x = LocalDate.of(c.getYear(), c.getMonth(), 1);
				int i = 0;
			   	int firstDayOfMonth = x.getDayOfWeek().getValue();
	           	while( i < firstDayOfMonth ) {
					System.out.print("\t");
					i++;
			  	}
				
				for( int dayCounter = 1; dayCounter <= x.lengthOfMonth(); dayCounter++ ) {
					if((dayCounter + 2) % 7  == 0) {
						System.out.println();
					}
					if( dayCounter == c.getDayOfMonth()) {
						System.out.print("[" + dayCounter + "]\t");
					}
					else {
						System.out.print(dayCounter + "\t");
					}
					
				}
	        }
	        
	        

	        }
