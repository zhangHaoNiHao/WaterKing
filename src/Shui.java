
public class Shui {
    public static void main(String[] args) {
      
    	int a[] = {1,2,1,2,1};
        int n = 0;
        int nid = -1;

        for(int i = 0;i < a.length;i++)
        {
            if(n == 0)
            {
            	if(i == a.length - 1){
            		nid = a[i];
            		break;
            	}
                if(a[i] == a[i + 1])
                {
                    n = 2;
                    nid = a[i];
                }
               
                else
                {
                	if((i+1) == a.length-1)
                		nid = a[a.length - 1];
                }
                i++;
            }
            else
            {
                if(nid == a[i])
                {
                    n++;
                }
                else
                {
                    n--;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
        System.out.println(" ");
        if(nid == -1)
        	System.out.println("没有水王");
        else
        	System.out.println("水王是 : " + nid);
        
    }
    
}