public class Main{
	public static void main(String[] args){
		double height1 = 1.6;
		double weight1 = 60.0;
		double bmi1 = ((double)Math.round(weight1 / Math.pow(height1, 2)*10))/10;
		System.out.println(bmi1);
		double height2 = 1.5;
		double weight2 = 56.0;
		double bmi2 = ((double)Math.round(weight2 / Math.pow(height2, 2)*10))/10;
		System.out.println(bmi2);
	}
}
