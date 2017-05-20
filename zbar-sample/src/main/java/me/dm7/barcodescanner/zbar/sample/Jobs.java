package me.dm7.barcodescanner.zbar.sample;

/**
 * Created by jugando on 20-May-17.
 */

public class Jobs {

    private String JobCardNo;
    private String ProjectName;
    private String DeliveryDate;


    public Jobs(String JobCardNo, String ProjectName, String DeliveryDate) {
        setJobCardNo(JobCardNo);
        setProjectName(ProjectName);
        setDeliveryDate(DeliveryDate);
    }

    public String getJobCardNo() {
        return JobCardNo;
    }

    public void setJobCardNo(String JobCardNo) {
        this.JobCardNo = JobCardNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }



}
