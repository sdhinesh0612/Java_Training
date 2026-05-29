public class Testing {
     void  display(){
        int target = 60;
        int[] arr = {10,20,30,40};
        
        for(int i=0; i<arr.length-1; i++){
            int Sum;
          for(int j=i=1; j<arr.length; j++){
            Sum = arr[i]+arr[j];
            if (Sum==target){
                System.out.println(i+","+j);
            }
          }break;
        }
                
    }
    public static void main(String[] args) {
        Testing obj = new Testing();
        obj.display();
    } 
}
