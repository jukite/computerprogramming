
public class ArrayException {

	public static void main(String[] args) {
		int[] intAray = new int[5];
		intAray[0] = 0;
		try {
		for(int i = 0; i < 5; i++) {
			intAray[i+1] = i+1+intAray[i];
			System.out.println("intArray[" +i+"])="+intAray[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: ArayIndexOutOfBounds");      
		}
	}

}
