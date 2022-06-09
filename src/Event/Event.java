package Event;

import java.util.Scanner;
public class Event {
		public static void main(String[] args) {
			int sel;
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 이달의 이벤트 보기");
			System.out.println("2. 전체 이벤트 보기");
			sel = sc.nextInt();
			while(true) {
				switch(sel) {
				case 1: System.out.println("이달의 이벤트");
					System.out.println("발탄 하드");
					break;
				case 2: System.out.println("전체 이벤트 보기");
					System.out.println("발탄 하드");
					System.out.println("비아키스 하드");
					System.out.println("쿠크세이튼 하드");
					System.out.println("아브렐슈드 하드");					
					break;
}
}
}
}
