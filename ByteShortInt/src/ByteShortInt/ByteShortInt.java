package ByteShortInt;

public class ByteShortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte myByteValue = -128;
		int myIntTotal = (myByteValue/2);
		//casting, smaller types will be accepted into the number type,  but you have to cast down
		byte myByteTotal = (byte) (myByteValue/2);
		System.out.println("myIntTotal" + myIntTotal);
		System.out.println("myByteTotal" + myByteTotal);
		// byte has max from -128 to 127
		// 1/4 amount of memory
		short myShortValue = -32768;
		// short to 32767
		long myLongValue  = 999999999999999999L;
		//  -2^63 .. ""-1
		// cannot mix types when doing operations,  number defaults to int
		// long should have L at end, not necessary but good for identifying
	}

}
