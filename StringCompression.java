class StringCompression
{
  
  public static void main(String[] args)
  {
    	System.out.println("Hello World");
		char[] arr = { 'a', 'a', 'b', 'a', 'z', 'b', 'i' };
        // a3,b2,z1,i1
        int i = 0;
        char key=' ';
        int counter = 0;
    //    List<String> ls = new ArrayList<>();
        System.out.print("[");
        while (i <=arr.length - 1) {
            key = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] == key && arr[j] != ' ') {
                    counter++;
                    arr[j] = ' ';

                }

            }
          if(key!=' '&&i<arr.length-1)
          {
                System.out.print(String.valueOf(key)+String.valueOf(counter+1)+",");

          }
          if(i==arr.length-1){
            System.out.print(String.valueOf(key)+String.valueOf(counter+1));   
          }
              
            counter = 0;
            i++;

        }
      

        System.out.print("]");
 
    
  }
}
