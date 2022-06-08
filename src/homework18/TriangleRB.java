package homework18;

//우하가 직각인 이등변 삼각형
public class TriangleRB extends AbstTriangle{
	
  public TriangleRB(int length) {
      super(length);
  }
	
  @Override
  public String toString() {
      return "TriangleRB(length:"+getLength()+")";
  }
	
  //좌상이 직각인 삼각형을 그린다
  public void draw() {
      for(int i=1; i<=getLength() ; i--) {
          for(int j=1;j<=getLength();j++) {
              System.out.print(' ');
          }
      for(int j=1 ; j<=i ; j++) {
          System.out.println('*');
      }
      System.out.println();
      }
  }
}