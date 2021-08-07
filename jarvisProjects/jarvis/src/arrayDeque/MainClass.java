package arrayDeque;

public class MainClass {

	public static void main(String[] args) {

		MyArrayDeque<Integer> ad = new MyArrayDeque<>();
		
		//push an element -: add to the first node
		
		ad.addToHead(12);
		ad.addToHead(13);
		ad.addToHead(14);
		ad.addToHead(15);
		ad.addToHead(16);
		ad.addToHead(17);
		ad.addToHead(18);
		ad.addToHead(19);

		//pop the element -: delete from first position after all operation done

		ad.removeLast();
		
		System.out.println(ad);
	}

}
