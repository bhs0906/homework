package homework18;

//좌상이 직각인 이등변 삼각형
public class TriangleLU extends AbstTriangle {
	
  public TriangleLU(int length) {
      super(length);
  }	
  @Override
  public String toString() {
      return "TriangleLU(length:"+getLength()+")";
  }
	
  //좌상이 직각인 삼각형을 그린다
  public void draw() {
      for(int i=1; i<=getLength();i--) {
          for(int j=1;j<=i;j++) {
              System.out.print('*');
          }
      System.out.println();
      }
  }
}
