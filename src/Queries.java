
import java.util.Scanner;

public class Queries implements QueriesInterface {
    private int  i, k=0;

    public void showByDiagnosis(String diagnosis, Patient objAry[]){
        System.out.println("Patients who have diagnosis "+diagnosis+":");
        i=0;
        while(i<objAry.length){
            if (objAry[i].diagnosis.equals(diagnosis)){
                System.out.println(objAry[i].first_name+"  "+objAry[i].surname);
                k++;
            }
            i++;
        }
        if (k==0) {
            System.out.println("no such diagnosis");
        } else {
            k=0;
        }

    }

    public void showByCardId(int left_position,int right_position, Patient objAry[]){
        System.out.println("Patients whose card id is between "+left_position+" and "+right_position+":");
        i=0;
        while(i<objAry.length){
            if (objAry[i].id > left_position && objAry[i].id<right_position){
                System.out.println(objAry[i].first_name+"  "+objAry[i].surname);
                k++;
            }
            i++;
        }
        if (k==0) {
            System.out.println("no such card id");
        } else {
            k=0;
        }
    }
    public String getSearchedDiagnosis(){
        System.out.println("Enter searched diagnosis: ");
        Scanner in = new Scanner(System.in);
        return(in.nextLine());
    }
    public int getSearchedIntervalLeftPosition(){
        System.out.println("Enter left position of searched card id interval: ");
        Scanner in = new Scanner(System.in);
        return(in.nextInt());
    }
    public int getSearchedIntervalRightPosition(){
        System.out.println("Enter right position of searched card id interval: ");
        Scanner in = new Scanner(System.in);
        return(in.nextInt());
    }
}
