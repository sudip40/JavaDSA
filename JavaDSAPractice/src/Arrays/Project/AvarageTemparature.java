package Arrays.Project;

import java.util.Scanner;

public class AvarageTemparature {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many number of days?");
            int n = sc.nextInt();
            int[] temparetures = new int[n];
            for(int i=1; i<=n; i++){
                System.out.println("Enter Day "+i+" tempareture : " );
                int t = sc.nextInt();
                temparetures[i-1] = t;
            }

            int totalTemp = 0;
            for(int i = 0; i<n; i++){
                totalTemp +=temparetures[i];
            }
            double avgTempareture = totalTemp/n;
            System.out.println("Avarage tempareture of the days is: "+avgTempareture);
        }
}
