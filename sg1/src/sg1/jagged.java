package sg1;

public class jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] arrayNo = {{1,2},{1,2,3},{1,2,3,4}};
    for(int i=0;i<arrayNo.length;i++) {
    	for(int j=0;j<arrayNo[i].length;j++)
    	{
    		System.out.print(arrayNo[i][j] +" ");
    		
    	}
    	System.out.println();
    }
	}

}
