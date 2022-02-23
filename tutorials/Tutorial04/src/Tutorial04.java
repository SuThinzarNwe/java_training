
public class Tutorial04 {
	public static void main(String[] args) {
		int row = 8;
		for (int i = 0; i < row; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
