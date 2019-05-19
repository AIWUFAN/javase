package com.jichu;

public enum CourseTypeEnum {

    /**
     * 只允许官方和讲师创建和运营
     */


    VIDE0_COURSE(1, "录播视频"),
    /**
     * 只允许官方创建和运营，初始化必须设置合理的上线报名人数
     */

    LIVE_COURSE(2, "直播视频"),

    /**
     * 只允许官方创建和运营
     */

    OFFLIVE_COURSE(3, "线下视频");


    private int seq;
    private String desc;

    CourseTypeEnum(int seq, String desc) {
        this.seq = seq;
        this.desc = desc;
    }

    public int getSeq() {
        return seq;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "CourseTypeEnum{" +
                "seq=" + seq +
                ", desc='" + desc + '\'' +
                '}';
    }
}
