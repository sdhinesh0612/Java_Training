public class Large_elmt{
    public static void main(){
        int[] Service = {2,2,1,2,3,4,4,3,3,3,3,3,2,2};
        int maxCount = 0;
        int maxElement = Service[0];
        
        for(int i=0; i<Service.length; i++){
            int count = 0;
            for(int j=0; j<Service.length; j++){
                if(Service[i] == Service[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxElement = Service[i];
            }
        }
        System.out.println("Largest count element: " + maxElement);
        System.out.println("Count: " + maxCount);
    }
}