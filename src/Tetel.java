public class Tetel {
    public static void Task01(){
        Integer[] a = {5, 3, 6, 2, 1};
        Integer[] b = {6, 2, 7, 8, 9};
        Integer[] c = new Integer[8];

        int n = a.length;
        int m = b.length;

        for(int i=0; i<n; i++){
            c[i] = a[i];
        }
        int k = n;
        for(int j=0 ; j<m; j++){
            int i = 0;
            while(i < n && b[j] != a[i]){
                i++;
            }
            if(i >= n){
                c[k] = b[j];
                k++;
            }
        }
        for(int num : c){
            System.out.print(num + " ");
        }
    }
}
