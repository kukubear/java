package day07;
//�߿�޼ҵ� 
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* startsWith
        * ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ�
        * ������ true �ٸ��� false
        * */
		
		String f = "apple";
		boolean StartWith = f.startsWith("a");
		System.out.println(StartWith);
	/*endWith
	 *���ڿ��� �������� �����ϴ� ���ڰ� �ִ��� �Ǵ�*/
		
		String a = "test";
		boolean endWith = a.endsWith("t");
		System.out.println(endWith);
		
	/*indexOf():������ ���ڰ� ���ڿ��� ���° �ִ��� �Ǵ�*/
		String b = "test";
	    int indexof = b.indexOf("t");
		System.out.println(indexof);
		
		/*equals():
		 * */
		
		/*lastIndexOf(): ������ ���ڿ��� ���������� �� ��°�� �����ϴ°�?*/
		
		//length(); ���ڿ�����
		//replace(,); ���ڿ��� ������ ���ڰ� ������ ���ο� ���ڷ� ��ü�ض�
		//replaceAll(): ������ ���ڷ� ����?!
		/*
		 * String str6 = "ja va"; String change = str6.replaceAll("\\p{Space}", "$"); //
		 * ����ȭ ǥ���� System.out.println(change);
		 */
		//9.spilt(): ���� ����
		
		//substring():���ڿ��� ������ ������ ���ϴ� ���ڿ��� ��ȯ
		
		//toLowerCase():�빮�ڸ� �ҹ��ڷ� ����
		//toUpperCase() : ���� �ݴ�
		//trim() : ���ڿ� ��������
		//toString() : ���ڿ� �״�� ���
		//contains() : �ΰ��� ���ڿ��� ���Ͽ� �񱳴�� ���ڿ��� �����ϰ� ������ true
		//charAt():������ index�� �ش��ϴ� ���� ���ڸ� ��ȯ
		//concat(,):���ڿ� ���ڸ� ���� + StringBuffer(Append)) ����
		String str10 = "apple";
		String str11 = "pie";
		String plus = str10.concat(str11);
		System.out.println(plus
				);
		//format()
		int i = 1234567890;
		String str14=String.format("%d", i);
		System.out.println(str14);
		
		//replaceFirst():���ڿ��� ������ ����""�� ������, ù��°�� ���� ������ ����""�� �ٲ�
		String str15 = "bman";
		String cge = str15.replaceFirst("b", "super"); 
		System.out.println(cge);
		
		
	}

}
