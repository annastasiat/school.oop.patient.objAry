
public class Main {
    public static void main (String[] args) {
        Patient objAry[] = new Patient[] {
                new Patient("Bob","Miller","Kyiv","headache",1523),
                new Patient("Sarah","Buttertree","Kharciv","flu",7426),
                new Patient("Lixer","Fixic","Anananarivu","flu",5966),
                new Patient("Mersedentia","Caterfield","Deli","fever",2458)
        };

        Queries query = new Queries();
        query.showByDiagnosis(query.getSearchedDiagnosis(), objAry);
        query.showByCardId(query.getSearchedIntervalLeftPosition(), query.getSearchedIntervalRightPosition(), objAry);

    }
   }
