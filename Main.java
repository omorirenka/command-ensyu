public class Main{
	public static void main(String[] args){
		double height = 1.6;
		double weight = 60.0;
		double bmi = ((double)Math.round(weight / Math.pow(height, 2)*10))/10;
		System.out.println(bmi);
	}
}
