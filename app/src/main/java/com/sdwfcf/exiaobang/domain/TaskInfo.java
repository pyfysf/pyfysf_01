package com.sdwfcf.exiaobang.domain;

/**
 * Created by shaofei on 2017/3/13.
 */

public class TaskInfo {
    /**
     * 任务分类常量-学校
     */
    public static final int TASK_TYPE_SCHOOL = 0x001;
    /**
     * 任务分类常量-商业街
     *
     */
    public static final int TASK_TYPE_BUSINESS_STREET = 0x002;
    /**
     * 任务分类常量-市里
     */
    public static final int TASK_TYPE_TO_CITY = 0x003;
    /**
     * 任务分类常量-其他
     */
    public static final int TASK_TYPE_OTHER = 0x004;
    /**
     * 任务类型常量-已完成
     */
    public static final int TASK_STATE_FINISH = 0x005;

    /**
     * 任务类型常量-正在进行
     */
    public static final int TASK_STATE_ING = 0x006;
    /**
     * 任务类型常量-等待确认
     */


    public static final int TASK_STATE_WAIT_CONFIRM = 0x007;
    /**
     * 任务类型常量-空闲
     *sklfjklasjdfklajfskdljklfj
     *
     */
    public static final int TASK_STATE_FREE = 0x008;


    /**
     * 任务id--每个任务的唯一标识
     */
    private String t_id;
    /**
     * 任务类型
     * 在本类的常量里挑选
     */
    private int t_type;
    /**
     * 任务创建时间
     */
    private String t_createDate;
    /**
     * 任务截止时间
     */
    private String t_stopDate;
    /**
     * 一句话描述
     */
    private String t_titleContent;

    /**
     * 任务佣金
     */
    private double t_money;

    /**
     * 任务的详细描述
     */
    private String t_detailedContent;

    /**
     * 任务图片的url
     */
    private String t_imageUrl;

    /**
     * 任务状态
     */
    private int t_state;

    public TaskInfo() {
    }

    public TaskInfo(String t_id, int t_type, String t_createDate,
                    String t_stopDate, String t_titleContent, double t_money,
                    String t_detailedContent, String t_imageUrl, int t_state) {
        this.t_id = t_id;
        this.t_type = t_type;
        this.t_createDate = t_createDate;
        this.t_stopDate = t_stopDate;
        this.t_titleContent = t_titleContent;
        this.t_money = t_money;
        this.t_detailedContent = t_detailedContent;
        this.t_imageUrl = t_imageUrl;
        this.t_state = t_state;
    }

    @Override
    public String toString() {
        return "TaskInfo{" +
                "t_id='" + t_id + '\'' +
                ", t_type=" + t_type +
                ", t_createDate='" + t_createDate + '\'' +
                ", t_stopDate='" + t_stopDate + '\'' +
                ", t_titleContent='" + t_titleContent + '\'' +
                ", t_money=" + t_money +
                ", t_detailedContent='" + t_detailedContent + '\'' +
                ", t_imageUrl='" + t_imageUrl + '\'' +
                ", t_state=" + t_state +
                '}';
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public int getT_type() {
        return t_type;
    }

    public void setT_type(int t_type) {
        this.t_type = t_type;
    }

    public String getT_createDate() {
        return t_createDate;
    }

    public void setT_createDate(String t_createDate) {
        this.t_createDate = t_createDate;
    }

    public String getT_stopDate() {
        return t_stopDate;
    }

    public void setT_stopDate(String t_stopDate) {
        this.t_stopDate = t_stopDate;
    }

    public String getT_titleContent() {
        return t_titleContent;
    }

    public void setT_titleContent(String t_titleContent) {
        this.t_titleContent = t_titleContent;
    }

    public double getT_money() {
        return t_money;
    }

    public void setT_money(double t_money) {
        this.t_money = t_money;
    }

    public String getT_detailedContent() {
        return t_detailedContent;
    }

    public void setT_detailedContent(String t_detailedContent) {
        this.t_detailedContent = t_detailedContent;
    }

    public String getT_imageUrl() {
        return t_imageUrl;
    }

    public void setT_imageUrl(String t_imageUrl) {
        this.t_imageUrl = t_imageUrl;
    }

    public int getT_state() {
        return t_state;
    }

    public void setT_state(int t_state) {
        this.t_state = t_state;
    }
}
