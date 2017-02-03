/**
 * Created by work on 02.02.2017.
 */
public interface QueriesInterface {
    public void showByDiagnosis(String diagnosis, Patient objAry[]);
    public void showByCardId(int left_position,int right_position, Patient objAry[]);
    public String getSearchedDiagnosis();
    public int getSearchedIntervalLeftPosition();
    public int getSearchedIntervalRightPosition();

}
