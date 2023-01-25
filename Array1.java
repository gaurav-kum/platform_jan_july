public class Array1 {
    public static void main(String[] args) {
// fixed sized array
        int nums[] = new int[4];
// multi-dimension array
        int nums1[][] = new int[3][4];

        int random = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
//                typecast because return double value
//                *100 because values are between 0 & 1
                nums1[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums1[i].length;j++) {
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        1 more method of for loop
        for(int n[]:nums1){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
