import com.sun.deploy.util.SessionState;

/**
 * Created by cs.ucu.edu.ua on 14.05.2017.
 */
public class Task {
    int Id;
    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        Id = ID;
    }

    public int getClientID() {
        return ClientID;
    }

    public void setClientID(int clientID) {
        ClientID = clientID;
    }

    int ClientID;

    public int getProjectID() {
        return ProjectID;
    }

    public void setProjectID(int projectID) {
        ProjectID = projectID;
    }

    int ProjectID;

    public String getData() {//result
        return Data;
    }

    public void setData(String data) {//result
        Data = data;
    }

    String Data;

    public String getNewTask() {
        return NewTask;
    }

    public void setNewTask(String newTask) {
        NewTask = newTask;
    }

    String NewTask;

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    String Result;


}
