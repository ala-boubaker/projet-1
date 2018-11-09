package com.aladino.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class TestJou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();

		List<ZoneId> lzi = Arrays.asList(

		        ZoneId.of("Europe/Paris"),

		        ZoneId.of("Asia/Tokyo"),

		        ZoneId.of("America/Anchorage")

		);  


		lzi .stream()

		    .forEach((x) -> {

		        System.out.println(x + " : \t" + ldt.atZone(x).toInstant());

		    });



	}

}
