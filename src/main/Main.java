package main;

import java.util.Scanner;

import Event.Event;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		Event ev = new Event();
		
		while(true) {
			System.out.println("1.회원관리 이동");
			System.out.println("2.이벤트 관리 이동");
			System.out.print(">>> ");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				break;
			case 2:
				ev.event();
				break;
			}
			
		}

	}

}
