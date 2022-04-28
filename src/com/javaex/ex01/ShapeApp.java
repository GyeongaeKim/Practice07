package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");
		//추상 클래스는 new 연산자로 직접 생성자를 호출할 수는 없다
		
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.showInfo();
		
		
		//sr1의 가로크기 출력
		System.out.println("가로크기: " + ((Ractangle)sr1).getWidth());
		
		
	}
}

	
	