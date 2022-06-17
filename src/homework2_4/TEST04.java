package homework2_4;

//4. enum 파일을 활용한 출력

public class TEST04 {

	public static void main(String[] args) {
		Season[] sea = Season.values();
		for(Season s:sea) {
			System.out.println(s);
		}
	}
}
