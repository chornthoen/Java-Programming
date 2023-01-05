package home;

public class main {
    public static void main(String[] args) {

        //4-----------------------------
        int n1 =0;
        do {
            System.out.println(n1);
            n1++;
            n1 = n1>2?0:n1;
        }while (n1>0);

        //5--------------------------------
        int s = 1;
        int n2 = 2;
        for (int i = s; i <= n2; i++) {
            for (int j = s; j <= n2; j++) {
                if (i == s || i == n2 || j == s || j == n2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

        }
        System.out.println();
        //6---------------------------------
        longestWord(new String[]{"Doing", "Testing", "Computer"});
        //7---------------------------------
        sumToN(5);
        //8---------------------------------
        sortNumber(new int[]{3,4,6,2,1,5});
        System.out.println();
        //9---------------------------------
        findMissingElement( new int[]{3,1,6}, new int[]{7,3,1});
        //10---------------------------------
        System.out.println(findMax(new int[]{2,5,1,2}));
    }

    static void longestWord(String[] arr){
        String longest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }
        }
        System.out.println(longest);
    }

    static void sumToN(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    static void sortNumber(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void findMissingElement(int[] arr1, int[] arr2){
        int temp;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(arr1[i]);
            }
        }
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
