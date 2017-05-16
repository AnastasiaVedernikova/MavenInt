import java.util.ArrayList;

/**
 * Created by cs.ucu.edu.ua on 04.03.2017.
 */
public interface Interf {
 //   public void setClientID(Integer t);
    public Integer getClientID();

//    public void setProjectID(Integer t);
    public Integer getProjectID();

    public Task DoAndBornTasks(Task st);
    public Task doTask(Task st);

}
