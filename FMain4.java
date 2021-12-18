
// �Լ� overloading
//		�Լ��� �ߺ��Ǹ� �ȵ�
//		�Ķ���� ������ �ڷ����� �ٸ��� ������(ȣ���Ҷ� ������ �Ǵ�)
public class FMain4 {
	// ������ 2�� ������ �� ū ���ڸ� ����ϴ� �Լ�
	public static void printBigger(int x, int y) {
		int bigger = (x > y) ? x : y;
		System.out.println(bigger);
	}
	
	// ������ 3�� ������ ���� ū ���ڸ� ����ϴ� �Լ�
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
