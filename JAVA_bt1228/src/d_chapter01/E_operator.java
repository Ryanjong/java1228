package d_chapter01;

// 자바의 연산자 
//		:	 산슬 연산자, 대입 연산자, 비교 연산자, 논리 연산자, 삼항 연산자 
public class E_operator {
	public static void main(String[] args) {

// 1. 산슬 연산자 
		
//		덧셈 연산자 (+): 좌황에 우항을 더한 값을 반환 
		int addResult = 8 + 3; 
		
//		뺄셈 연산자 (-): 자황에 우항을 뺀 값을 반환 
		int minusResult = 8 - 3; 
		
//		곱셈 연산자 (*): 자황에 우항을 곱한 값을 반황 
		int multiResult = 8 * 3;
		
//		나눗셈 연산자(/): 자황에 우항을 나눈 값을 반환
		int remainderResult = 8 / 3;
		System.out.println(addResult);
		System.out.println(minusResult);
		System.out.println(multiResult);
		System.out.println(remainderResult);
		
// 나머지 연산자(%): 자황에 우항을 나눈 나머지를 반환
//8 = 3 * 2 ( 몫) + 2 (나머지) 
		int remainderResult2 = 8 % 3;
		System.out.println( remainderResult2); 
		
//		해당 수가 2의 배수인지를  확인 
//		: 해당 수를 2로 나누어서(%) 나머지가 0인 경우 확인 가능 
		
//		2.증감 연산자 
//		: '변수' 그 자신에 1 증가 또는 감소
//		: 상수에는 증감 연산자 사용 X
		final int NUMBER = 10;
//		NUMBER++; - Error

		
//		2. 중감  연산자 (++)
//		: 연산자의 조항 혹은 우항의 값을 1 증가시킴 
		int integer = 10; 
		
		
		System.out.println(++integer); // 11 (증가 O)
//		: 변수명 앞에 증가 연산자 사용시 해당 변수를 즉각 증가 
		
		System.out.println(integer++); // (증가 X) 
//		: 변수명 뒤에 증가 연산자 사용시 해당 변수를 다음 호출 시 증가 
		
		System.out.println(integer); // 12 
		
		integer++; // 12 
		integer++; // 13
		++integer; // 15 
		System.out.println(integer); // 16
		
// 감소 연산자 (- - ) 
// 	: 연산자의좌항 혹은 우항에 값을 1 감소시킴
		integer = 10;
		- - integer ; // 9 (즉각 감소) 
		integer- -; // 9 (다음 호출시 감소 
		System.out.println(integer); //
		
		int num1 = 8;
		int num2 = 3;
		int sampleNumber = num1 / - -num2; // 8 / 2
		System.out.println( samplerNumber ); // 4 
		
//			3. 대입 연산자 
//			: = 우항의 값을 좌황에 (누적)대입
//			: 좌항의 변수에 좌항 변수와 우황을 연산한 결과를 대입
		
//			= 좌항에 우황을 대입 
		int num = 10; 
		
//			+= : 좌항에 우황을 더한값을 좌항에 대입 
			num += 3; // num = num  + 3; 
			
//			-= : 좌항에 우황을 뺀 값을 좌항에 대입 
			num -= 6; // num = num - 6; // 7 
			
//			/= : 좌항에 으황을 나눈 값을 좌항에 대입 
			num /= 5; // num = num / 5; // 4 
			
// %= : 좌항에 으황을 나눈 나머지를 좧항에 대입 
			num %= 3; // num = num % 3; // 1
			System.out.println(num); 
			
//			: 대입 연산자의 좌항에는 반드시 변수만 저장가능 
			
//			4. 비교 연산자 
//			; 좌항에 우항가 비교한 결과를 논리(true, false) 값을도 변환

// 		== 
//			: 좌항이 우황과 같다면 true, 아니면 false 반환 
			boolean bool = 10 = = 23; 
			System.out.println(bool1); // false 
			
//		!=
//		: 좌항에 우황과 다르다면 true, 같으면 false 반환 
			boolean bool2 = 10 ! =12 
	       System.out.println(bool2); // true 
			
//			>, >= 
//			:자황이 우황보다 작으면 true, 아니면 flase 
//			; 자황이 우황보다 크거나 같으면 true, 아니면, false 
			boolean bool3 = 10 > 10; 
			boolean bool 4 = 10 > = 10; 
			System.out.println(bool3); // false 
			System.out.println(bool4); // true 
			
//			<,	<=
// 좌황이 우황보다 작으면 true, 아니면 false 
//	좌황이 우황보다 작건가 같으면 true,아니면 false 
			boolean  bool5 = 10 < 10; 
			boolean  bool6 =10 <= 10;
			System.out.println(bool5);
			System.out.println(bool6);
			
//줄복사 단축기: ctrl + alt + 방황키 
// 	줄 이동 단축키: alt = 방향키 
			
//		5. 논리 연산자 
//		: 논리( boolean) 값을 연산하는 연산자 
			
// 	&&(엠퍼센트): And 연산자 
//		: 좌항광 우황이 모드 true일 때 true, 하나로 false인 경우 false 
		 int andOper1 = 8;
		 int andoper2 = 3; 
		 
		 boolean andBool1 = (andoper1 > andOper2) && true; 
		 boolean andBool1 = (andoper1 < andOper2) && true; 
	
		 C; // true 
		 System.out.println(andBool2); // false 
		 
//		||(vertical bar): or 연산자 
//		: 좌항과 우황 중 하나라도 true하면 true, 모두 false인 경우 false 
		 int orOper1 = 5; 
		 int orOper2 = 7; 
		 
		 boolean or Bool1 = (orOper1 < orOper2) || true;
		 boolean or Bool2 = (orOper1 > orOper2) || true;
		 boolean or Bool3 = (orOper1 > orOper2) || false; 
		 
		 System.out.println(orBool1); // true 
		 System.out.println(orbool2); // true 
		 System.out.println(orbool3); // false 
		 
//		!: (not)연산자
// 	: 논리값의 부정을 반환 
		 boolean notbool1 = true;
		 boolean notbool2 = false; 
		 
		 System.out.println(notBool1); // false
		 System.out.println(notBool2); // true
	}


}
