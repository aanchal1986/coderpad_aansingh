class ShortestPathArray {
  
  public  static void shortestPath(int[][] myArray )
  {
    int[] shortindex = new int[(myArray.length)+1];
    

    for( int i=1; i<myArray.length; i++){
      
    for( int j=myArray.length; j>i; j--){
        

    if(myArray[i].length>myArray[j-1].length)
    {
      shortindex=myArray[j-1];
    }
    else if(myArray[i].length<myArray[j-1].length)
    {
     
      shortindex=myArray[i];
    
    }
             
     }

    }

   for( int k : shortindex)
   {
    System.out.println(k); 
   }
  }
  
  
  public static void main(String[] args) {
    
    int[][] arr = { {1,2,3,4},{0,2,7},{4,12},{1,2,5,6}} ;
    
    shortestPath(arr);
    
  }
    
  }
