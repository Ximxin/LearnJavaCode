package top.xmxin.interfacetest;

public class Rectengle extends RectengleAbstract {

	@Override
	public int RectengleArea(int length, int width) {
		return length * width;
	}

	@Override
	public int RectenglePerimeter(int length, int width) {
		return 2 * (length + width);
	}
	
}
