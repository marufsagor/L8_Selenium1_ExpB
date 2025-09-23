package ClassOne;

public class LargestNo {

    public static void main(String[] args) {

        int Num1=10;
        int Num2=20;
        int Num3=30;

        int largest;
        if(Num1>=Num2&&Num1>=Num3){

            largest=Num1;
        } else if (Num2>=Num1&&Num2>=Num3) {
            largest=Num2;

        } else {
            largest=Num3;

        }
        System.out.printf("largest"+largest);
    }


}
