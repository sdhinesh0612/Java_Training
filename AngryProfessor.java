
class AngryProfessor {

    public static String angryProfessor(int k, int[] a) {

        int count = 0;

        for(int i=0; i<a.length; i++) {

            if(a[i] <= 0) {
                count++;
            }
        }

        if(count < k) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public static void main(String[] args) {

        int[] a = {-2,-1,0,1,2};
        int k = 3;

        System.out.println(angryProfessor(k, a));
    }
}