import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {

	public static void main(String[] args) {
		
		//INSTANCIACAO
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		//instanciando data-hora de agora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d01);
		System.out.println(d02);
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		//------------------------------------
		//instanciado data-hora no formato ISO
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);

		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		
		//FORMATACAO
		
		LocalDate d012 = LocalDate.parse("2022-07-20");
		LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;

		
		System.out.println(d012.format(fmt3));//ou
		System.out.println(fmt3.format(d012));//ou
		System.out.println(d012.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
		System.out.println(d13.format(fmt4));	
		System.out.println("D13 COM ISO DATA TIME: "+ d13.format(fmt6));
		
		System.out.println(fmt5.format(d14));
		System.out.println(fmt7.format(d14));
		//ou
		System.out.println(d14.toString());
		
		
		//CONVERTER DATA-HORA GLOBAL PARA LOCAL 
		
		LocalDate d15 = LocalDate.parse("2022-07-20");
		LocalDateTime d16 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d17 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d17, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d17, ZoneId.of("Portugal"));

		LocalDateTime r3 = LocalDateTime.ofInstant(d17, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d17, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);		
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 Portugal = " + r4);
		
		//Obter dados de data-hora local
		System.out.println("d15 dia: " + d15.getDayOfMonth());
		System.out.println("d15 mes: " + d15.getMonthValue());
		
		System.out.println("d16 hora: " + d16.getHour()); 
		
		//Cálculos com data-hora
		LocalDate pastWeek = d15.minusDays(7); //uma semana antes de d15
		LocalDate nextWeek = d15.plusDays(7); //uma semana depois de d15

		
		System.out.println("Uma semana antes de d15: "+pastWeek);
		System.out.println("Uma semana depois de d15: "+nextWeek);
		
		LocalDateTime pastWeekTime = d16.minusDays(7); //uma semana antes de d16
		LocalDateTime nextWeekTime = d16.plusDays(7); //uma semana depois de d16
		
		System.out.println("Uma semana antes de d16: "+pastWeekTime);
		System.out.println("Uma semana depois de d16: "+nextWeekTime);
		
		Instant pastWeekInstant = d17.minus(7,ChronoUnit.DAYS);//uma semana antes de d17
		Instant nextWeekInstant = d17.plus(7,ChronoUnit.DAYS); //uma semana depois de d17
		
		System.out.println("Uma semana antes de d17: "+pastWeekInstant);
		System.out.println("Uma semana depois de d17: "+nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekTime, d16);
		System.out.println("t1 dias: " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeek.atStartOfDay(), d15.atStartOfDay());
		System.out.println("t2 dias: " + t2.toDays());

		Duration t3 = Duration.between(pastWeekInstant, d17);
		Duration t3Invertido = Duration.between(d17, pastWeekInstant);

		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t3 invertido dias: " + t3Invertido.toDays());



		
	}

}
