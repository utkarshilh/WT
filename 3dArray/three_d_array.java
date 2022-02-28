public static three_d_array{


   public static void main(String args[])
   { 
   
      int a[][] = new int[3][3];
      
      //assigning the value to the array
      
      
      int count =1;
      
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
        
            a[i][j] = count;
            
            count++;
            
        }
      
      }
      
      for(int i=0;i<n;i++)
      {
      
         for(int j=0;j<n;j++)
         {
         
           System.out.print(a[i][j]+" ");
           
         }
         System.out.println("");
         
      }
   }
}