/**
 * Created by work on 01.02.2017.
 */


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
        query.showByDiagnosis(searchedDiagnosis, objAry);
        int left_position = query.getSearchedIntervalLeftPosition();
        int right_position = query.getSearchedIntervalRightPosition();
        query.showByCardId(left_position, right_position, objAry);

    }
   }
