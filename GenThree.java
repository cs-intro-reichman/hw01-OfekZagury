/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        int ans1 = (int)(Math.random() * (max - min + 1) + min);
        int ans2 = (int)(Math.random() * (max - min + 1) + min);
        int ans3 = (int)(Math.random() * (max - min + 1) + min);

        int minans = Math.min(ans1, ans2);
        minans = Math.min(minans, ans3);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println("The minimal generated number was: " + minans);

	}
}
