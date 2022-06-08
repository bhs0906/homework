package homework18;

//좌하가 직각인 이등변 삼각형 클래스

public class TriangleLB extends AbstTriangle {
	
  public TriangleLB(int length) {
      super(length);
  }

  //좌하가 직각인 삼각형의 정보를 문자열로 반환
  @Override
  public String toString() {
      return "TriangleLB(length:"+getLength()+")";
  }
	
  //좌하가 직각인 삼각형을 그린다
  public void draw() {
  for(int i=1; i<=getLength();i++) {
      for(int j=1;j<=i;j++) {
          System.out.print('*');
      }
  System.out.println();
  	}
  }  
 }