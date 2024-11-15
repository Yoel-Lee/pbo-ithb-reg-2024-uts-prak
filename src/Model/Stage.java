package Model;

import java.util.Date;

public class Stage extends PerfomanceSchedule{
    String stageName;
    int capacity;
    String stageLocation;






    public Stage(Date startDate, Date endTime, String stageName, int capacity, String stageLocation) {
        super(startDate, endTime);
        this.stageName = stageName;
        this.capacity = capacity;
        this.stageLocation = stageLocation;
    }








    public void getPerfomnAndStageDetails(){
       super.getPerfomnAndStageDetails();
       System.out.println("stage name : "+stageName);
       System.out.println("stage capacity : "+capacity);
       System.out.println("stage name : "+stageLocation);

    }

}
