package day07;
//중요메소드 
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* startsWith
        * 문자열이 지정한 문자로 시작하는지 판단
        * 같으면 true 다르면 false
        * */
		
		String f = "apple";
		boolean StartWith = f.startsWith("a");
		System.out.println(StartWith);
	/*endWith
	 *문자열에 마지막에 지정하는 문자가 있는지 판단*/
		
		String a = "test";
		boolean endWith = a.endsWith("t");
		System.out.println(endWith);
		
	/*indexOf():지정한 문자가 문자열에 몇번째 있는지 판단*/
		String b = "test";
	    int indexof = b.indexOf("t");
		System.out.println(indexof);
		
		/*equals():
		 * */
		
		/*lastIndexOf(): 저장한 문자열이 마지막으로 몇 번째에 존재하는가?*/
		
		//length(); 문자열길이
		//replace(,); 문자열에 지정한 문자가 있으면 새로운 문자로 대체해라
		//replaceAll(): 지정한 문자로 변경?!
		/*
		 * String str6 = "ja va"; String change = str6.replaceAll("\\p{Space}", "$"); //
		 * 정규화 표현식 System.out.println(change);
		 */
		//9.spilt(): 문자 구분
		
		//substring():문자열에 지정한 범위에 속하는 문자열을 반환
		
		//toLowerCase():대문자를 소문자로 변경
		//toUpperCase() : 위랑 반대
		//trim() : 문자열 공백제거
		//toString() : 문자열 그대로 출력
		//contains() : 두개의 문자열을 비교하여 비교대상 문자열을 포함하고 있으면 true
		//charAt():지정한 index에 해당하는 문자 한자를 반환
		//concat(,):문자와 문자를 겳합 + StringBuffer(Append)) 참고
		String str10 = "apple";
		String str11 = "pie";
		String plus = str10.concat(str11);
		System.out.println(plus
				);
		//format()
		int i = 1234567890;
		String str14=String.format("%d", i);
		System.out.println(str14);
		
		//replaceFirst():문자열에 지정한 문자""가 있으면, 첫번째만 새로 지정한 문자""로 바꿈
		String str15 = "bman";
		String cge = str15.replaceFirst("b", "super"); 
		System.out.println(cge);
		
		
	}

}
