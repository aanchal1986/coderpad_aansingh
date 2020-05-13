@RunWith(Parameterized.class)
class MaxCharOccurTest
{
  
   public String str="aabcd";
     
  
    public String resultExpected="aabcd";
  
  
  @Test
  public void testCountChar() 
    {
        Assert.assertEquals(resultExpected, MaxCharOccurTest.testMaxChar(input));
    }
  
  public  static void testMaxChar (String str){
    
    char[] chararray =str.toCharArray();
    
    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
    
    
    for (char c : chararray)
    {
      System.out.println(c);
      if(hm.containsKey(c))
        hm.put(c,hm.get(c)+1);
      else
        hm.put(c,1);
    }
    
    Set<Map.Entry<Character,Integer>> es= hm.entrySet();
    
    for(Map.Entry<Character,Integer> e: es)
    {
      Character key=e.getKey();
      Integer  value= e.getValue();
      
      if(value>1)
        System.out.println("key:" +key + " " + "value" + value);
    
    }
  }
  
}

