package PerfersorEatProblem;

public class Test {
	public static void main(String[] args) {
		Choip choip[]=new Choip[5];
		TecherThread techer[]=new TecherThread[5];
		
		for(int i=0;i<5;i++)
		{
			choip[i]=new Choip();
		}
		
		for(int j=0;j<5;j++)
		{
			techer[j]=new TecherThread("techer"+j,choip[j],choip[(j+1)%5]);
		}
	}

}
