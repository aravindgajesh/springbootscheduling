package com.ctsbny.demo;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CtsbnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtsbnyApplication.class, args);
	}

	@Scheduled(initialDelay = 1000, fixedRate = 5000)
	public void run() {
	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	}
	
//	@Scheduled(cron = "0 0/1 * 1/1 * ?")
	@Scheduled(cron = "*/10 * * * * *")
	public void runCron() {
		System.out.println("Current CRON time is :: " + Calendar.getInstance().getTime());
	}
	
	@Scheduled(fixedDelay = 2000)
	public void runFixed() {
		System.out.println("FIXED DELAY time is :: " + Calendar.getInstance().getTime());
	}
	
	@Scheduled(fixedDelay = 2000, zone = "CET")
	public void runOther() {
		System.out.println("OTHER :: " + Calendar.getInstance().getTime());
	}
}
