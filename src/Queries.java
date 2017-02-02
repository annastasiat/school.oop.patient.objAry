/**
 * Created by work on 02.02.2017.
 */
import java.util.Scanner;

public class Queries implements QueriesInterface {
    public String diagnosis;
    public int left_position, right_position;

    public void getByDiagnosis(String diagnosis, Patient objAry[],int i){
        System.out.println("Patients who have diagnosis "+diagnosis+":");
        while(i<objAry.length){
            if (objAry[i].diagnosis.equals(diagnosis)){
                System.out.println(objAry[i].first_name+"  "+objAry[i].surname);
            }
            i++;
        }
    }

    public void getByCardId(int left_position,int right_position, Patient objAry[],int i){
        System.out.println("Patients whose card id is between "+left_position+" and "+right_position+":");
        while(i<objAry.length){
            if (objAry[i].id > left_position && objAry[i].id<right_position){
                System.out.println(objAry[i].first_name+"  "+objAry[i].surname);
            }
            i++;
        }
    }
    public String getSearchedDiagnosis(){
        System.out.println("Enter searched diagnosis: ");
        Scanner in = new Scanner(System.in);
        diagnosis = in.nextLine();
        return(diagnosis);
    }
    public int getSearchedIntervalLeftPosition(){
        System.out.println("Enter left position of searched card id interval: ");
        Scanner in = new Scanner(System.in);
        left_position = in.nextInt();
        return(left_position);
    }
    public int getSearchedIntervalRightPosition(){
        System.out.println("Enter right position of searched card id interval: ");
        Scanner in = new Scanner(System.in);
        right_position = in.nextInt();
        return(right_position);
    }
}
