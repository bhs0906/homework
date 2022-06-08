package homework18;

//우상이 직각인 이등변 삼각형
public class TriangleRU extends AbstTriangle{
	
  public TriangleRU(int length) {
      super(length);
  }
	
  @Override
  public String toString() {
      return "TriangleRU(length:"+getLength()+")";
  }
	
  //좌상이 직각인 삼각형을 그린다
  public void draw() {
      for(int i=getLength(); i>=1;i--) {
          for(int j=1;j<=getLength()-i;j++) {
              System.out.print(' ');
          }
      for(int j=1;j<=i;j++) {
          System.out.println('*');
      }
      System.out.println();
      }
  }
}
