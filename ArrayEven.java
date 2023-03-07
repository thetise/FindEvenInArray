package ArrayHomeworks;

public class ArrayEven {

    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {2,11,16,84,54,23,14,2,8,16,12,84,14,25,95,3,54};
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        System.out.print("Sayı dizisinde tekrar eden çift sayılar:");

        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < i; j++){
                if(list[j] == list[i]){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for(int value: duplicate){
            if (value % 2 == 0 && value !=0){
                System.out.print(" ");
                System.out.print(value);
            }
        }
    }
}