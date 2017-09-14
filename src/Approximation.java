/**
 * @author lees13
 * Performs Euler's Method with an initial coordinate, change in x, and portions split.
 *
 */
public class Approximation {
	double x_start, y_start, h, answer;
	double[] result;
	int n;
	
	public Approximation(double x, double y, double h, int n) {
		x_start = x;
		y_start = y;	
		this.h = h;		// change in x
		this.n = n;		// # of portions
		approx();
	}
	
	public void approx() {
		double curX = x_start;
		double curY = y_start;
		result = new double[n];
		for(int i = 0; i < n; i++) {
			curY = next(curX, curY);
			curX += h;
			result[i] = curY;
		}
		answer =  result[n - 1];
	}
	
	public double next(double xn, double yn) {
		// formula: y_n+1 = y_n + h * (slope(x, y))
		return yn + h * slope(xn, yn);
	}

	/**
	 * Calculates the derivative. Remember to change every time.
	 * @return slope
	 */
	public double slope(double x, double y) {
		return (70 - y);
	}
	
	public void printArray() {
		for(double x : result)
			System.out.println(x);
	}
	
	public double getAnswer() {
		return answer;
	}
	
	public String toString(){
		String str = "X: " + x_start;
		str += "\nY: " + y_start;
		str += "\nh: " + h;
		str += "\nn: " + n;
		str += "\n" + getAnswer();
		return str;
	}
}
