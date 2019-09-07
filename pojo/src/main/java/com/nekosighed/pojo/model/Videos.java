package com.nekosighed.pojo.model;

import java.io.Serializable;
import java.util.Date;

/**
* @Description:
* @Author: chf
* @CreateDate: null
*/
public class Videos implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 发布者id
     */
    private String userId;

    /**
     * 用户使用音频的信息
     */
    private String audioId;

    /**
     * 视频描述
     */
    private String videoDesc;

    /**
     * 视频存放的路径
     */
    private String videoPath;

    /**
     * 视频秒数
     */
    private Float videoSeconds;

    /**
     * 视频宽度
     */
    private Integer videoWidth;

    /**
     * 视频高度
     */
    private Integer videoHeight;

    /**
     * 视频封面图
     */
    private String coverPath;

    /**
     * 喜欢/赞美的数量
     */
    private Long likeCounts;

    /**
     * 视频状态：
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * videos
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Description: 
     * @Author: chf
     * @CreateDate: 2019-09-07 13:23:25
     */
    public Videos(String id, String userId, String audioId, String videoDesc, String videoPath, Float videoSeconds, Integer videoWidth, Integer videoHeight, String coverPath, Long likeCounts, Integer status, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.audioId = audioId;
        this.videoDesc = videoDesc;
        this.videoPath = videoPath;
        this.videoSeconds = videoSeconds;
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        this.coverPath = coverPath;
        this.likeCounts = likeCounts;
        this.status = status;
        this.createTime = createTime;
    }

    /**
     * @Description: 
     * @Author: chf
     * @CreateDate: 2019-09-07 13:23:25
     */
    public Videos() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId == null ? null : audioId.trim();
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc == null ? null : videoDesc.trim();
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    public Float getVideoSeconds() {
        return videoSeconds;
    }

    public void setVideoSeconds(Float videoSeconds) {
        this.videoSeconds = videoSeconds;
    }

    public Integer getVideoWidth() {
        return videoWidth;
    }

    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    public Integer getVideoHeight() {
        return videoHeight;
    }

    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    public Long getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(Long likeCounts) {
        this.likeCounts = likeCounts;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}