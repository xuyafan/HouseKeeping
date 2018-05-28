package nju.xyf.request;

public class OrderCondition {

    private int id;
    private String type;

    private long startDate;
    private long endDate;

    public OrderCondition() {
    }

    public OrderCondition(String type, long startDate, long endDate) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Test
    private String locationTest;
    private String startDateTest;
    private String endDateTest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public String getLocationTest() {
        return locationTest;
    }

    public void setLocationTest(String locationTest) {
        this.locationTest = locationTest;
    }

    public String getStartDateTest() {
        return startDateTest;
    }

    public void setStartDateTest(String startDateTest) {
        this.startDateTest = startDateTest;
    }

    public String getEndDateTest() {
        return endDateTest;
    }

    public void setEndDateTest(String endDateTest) {
        this.endDateTest = endDateTest;
    }
}
