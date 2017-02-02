/**
 * Created by work on 02.02.2017.
 */
public interface QueriesInterface {
    public void getByDiagnosis(String diagnosis, Patient objAry[],int i);
    public void getByCardId(int left_position,int right_position, Patient objAry[],int i);
    public String getSearchedDiagnosis();
    public int getSearchedIntervalLeftPosition();
    public int getSearchedIntervalRightPosition();
}
