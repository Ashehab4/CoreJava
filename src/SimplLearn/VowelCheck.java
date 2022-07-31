package SimplLearn;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Here we gO to North Coast ";
		char[] array1 =str.toCharArray();
		
		str=str.toLowerCase();
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (current=='a' ||current=='e' ||current=='i' ||current=='o' ||current=='u') {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
