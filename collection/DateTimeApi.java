package collection;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApi {

	public static void main(String[] args) {
		// human readable
		LocalDate d = LocalDate.now();
		LocalDate d2 = LocalDate.of(2024,12,29);
		System.out.println(d2);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		
		LocalDateTime ltd = LocalDateTime.now();//gives ist time
		System.out.println(ltd);
		
		//Machine readable with GMT time
		Instant i = Instant.now();
		System.out.println(i);

	}

}
