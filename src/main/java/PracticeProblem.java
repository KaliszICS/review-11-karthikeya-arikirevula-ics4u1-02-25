public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public static String[] createArray(String one, String two, String three, String four) {
		String[] stringArray = {one, two, three, four};
		return stringArray;
	}

	public static int findValue(int num, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String word, String[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word)) {
				count++;
				if (count == 3) {
					return i;
				}
			}
		}
		return -1;
	}
}


