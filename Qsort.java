public class Qsort {
    public static int[] n = new int[10];
    public static void main(String[] args) {
        randnum();
        int f = 0;
        int l = n.length-1;
        Quicksort(f, l);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
    }
    public static void randnum(){
        for (int i = 0; i < 10; i++) {
            int randn = (int)(Math.random()*(100-1+1)+1);
            n[i] = randn;
        }
    }
    public static void Quicksort(int l,int r){
        if (l>=r){    	  
        	return;
        }
    	int f_b=l,r_b=r;
    	int pivot;
        pivot = (l+r)/2;
    	int datapivot=n[pivot];  	
    	while (true)
    	{    	
    		while (n[l]<datapivot){
    			l=l+1;
            }
    		while (n[r]>datapivot){   		
    			r=r-1;
            }
    		swap(l,r);
    		if ( l>=r ){
    			break;
            }
    		if (n[l]==n[r]){
    			l=l+1;
            }
    	}
    	Quicksort(f_b,r-1); 	 
        Quicksort(r+1,r_b);
    }
    public static void swap(int l,int r){
        int temp = n[l];
        n[l] = n[r];
        n[r] = temp;
    }
}
