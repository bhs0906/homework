package homework18;

public abstract class AbstTriangle extends Shape {

    //한 변의 길이를 나타내는 int형 필드
    private int length;
	
    //직각 이등변 삼각형 생성자
    public AbstTriangle(int length) {
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
	
    @Override
    public String toString() {
        return "AbstTriangle(length=" + length + ")";
    }
}