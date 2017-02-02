/**
 * Created by work on 01.02.2017.
 */
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Patient objAry[] = new Patient[] {
                new Patient("Bob","Miller","Kyiv","headache",1523),
                new Patient("Sarah","Buttertree","Kharciv","flu",7426),
                new Patient("Lixer","Fixic","Anananarivu","flu",5966),
                new Patient("Mersedentia","Caterfield","Deli","fever",2458)
        };

        Queries query = new Queries();
        String searchedDiagnosis = query.getSearchedDiagnosis();
        query.getByDiagnosis(searchedDiagnosis, objAry, 0);
        int left_position = query.getSearchedIntervalLeftPosition();
        int right_position = query.getSearchedIntervalRightPosition();
        query.getByCardId(left_position, right_position, objAry, 0);

    }
   }
