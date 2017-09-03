package es.david.fechas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class FechasUtils
{
	private static void femasmias()
	{
		Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
		System.out.println(duration.get(ChronoUnit.SECONDS));
	}

	public static void main(String[] args)
	{
		Duration duration = Duration.ofHours(1);
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now : " + now);
		Temporal time = duration.addTo(now);
		System.out.println("time : " + time);
		
		Duration d1= Duration.ofSeconds(301);
		Duration d2 = d1.multipliedBy(2);
		Duration d3 =  d1.negated();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}
}
