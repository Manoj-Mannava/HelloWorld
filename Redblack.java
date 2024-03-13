import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   char[][] a=new char[n][n];
	   for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	           a[i][j]=sc.next().charAt(0);
	       }
	       
	   }
	    for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	   System.out.println(a[i][j]+" ");
	}
	}    }
}
