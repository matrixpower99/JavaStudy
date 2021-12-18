
// 함수 overloading
//		함수명 중복되면 안됨
//		파라메터 갯수나 자료형이 다르면 괜찮음(호출할때 구별이 되니)
public class FMain4 {
	// 정수를 2개 넣으면 더 큰 숫자를 출력하는 함수
	public static void printBigger(int x, int y) {
		int bigger = (x > y) ? x : y;
		System.out.println(bigger);
	}
	
	// 정수를 3개 넣으면 제일 큰 숫자를 출력하는 함수
	public static void printBigger(int x, int y, int z) {
		int bigger = (x > y) ? x : y;
		bigger = (bigger > z) ? bigger : z;
		System.out.println(bigger);
	}
	
	public static void main(String[] args) {
		printBigger(10, 3);
		printBigger(1000, 111111);
		printBigger(12, 13, 66);
		printBigger(120, 1, 66);
	}
}
