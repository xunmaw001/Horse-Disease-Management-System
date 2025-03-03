package com.entity.vo;

import com.entity.MabingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 马病
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("mabing")
public class MabingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 马病编号
     */

    @TableField(value = "mabing_uuid_number")
    private String mabingUuidNumber;


    /**
     * 马病名称
     */

    @TableField(value = "mabing_name")
    private String mabingName;


    /**
     * 马病照片
     */

    @TableField(value = "mabing_photo")
    private String mabingPhoto;


    /**
     * 病因类型
     */

    @TableField(value = "mabing_types")
    private Integer mabingTypes;


    /**
     * 基本症状
     */

    @TableField(value = "zhengzhuang_text")
    private String zhengzhuangText;


    /**
     * 治疗方案
     */

    @TableField(value = "zhiliaofangan_text")
    private String zhiliaofanganText;


    /**
     * 预防方案
     */

    @TableField(value = "yufangfangan_text")
    private String yufangfanganText;


    /**
     * 点击次数
     */

    @TableField(value = "mabing_clicknum")
    private Integer mabingClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "mabing_delete")
    private Integer mabingDelete;


    /**
     * 马病详细介绍
     */

    @TableField(value = "mabing_content")
    private String mabingContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：马病编号
	 */
    public String getMabingUuidNumber() {
        return mabingUuidNumber;
    }


    /**
	 * 获取：马病编号
	 */

    public void setMabingUuidNumber(String mabingUuidNumber) {
        this.mabingUuidNumber = mabingUuidNumber;
    }
    /**
	 * 设置：马病名称
	 */
    public String getMabingName() {
        return mabingName;
    }


    /**
	 * 获取：马病名称
	 */

    public void setMabingName(String mabingName) {
        this.mabingName = mabingName;
    }
    /**
	 * 设置：马病照片
	 */
    public String getMabingPhoto() {
        return mabingPhoto;
    }


    /**
	 * 获取：马病照片
	 */

    public void setMabingPhoto(String mabingPhoto) {
        this.mabingPhoto = mabingPhoto;
    }
    /**
	 * 设置：病因类型
	 */
    public Integer getMabingTypes() {
        return mabingTypes;
    }


    /**
	 * 获取：病因类型
	 */

    public void setMabingTypes(Integer mabingTypes) {
        this.mabingTypes = mabingTypes;
    }
    /**
	 * 设置：基本症状
	 */
    public String getZhengzhuangText() {
        return zhengzhuangText;
    }


    /**
	 * 获取：基本症状
	 */

    public void setZhengzhuangText(String zhengzhuangText) {
        this.zhengzhuangText = zhengzhuangText;
    }
    /**
	 * 设置：治疗方案
	 */
    public String getZhiliaofanganText() {
        return zhiliaofanganText;
    }


    /**
	 * 获取：治疗方案
	 */

    public void setZhiliaofanganText(String zhiliaofanganText) {
        this.zhiliaofanganText = zhiliaofanganText;
    }
    /**
	 * 设置：预防方案
	 */
    public String getYufangfanganText() {
        return yufangfanganText;
    }


    /**
	 * 获取：预防方案
	 */

    public void setYufangfanganText(String yufangfanganText) {
        this.yufangfanganText = yufangfanganText;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMabingClicknum() {
        return mabingClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setMabingClicknum(Integer mabingClicknum) {
        this.mabingClicknum = mabingClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMabingDelete() {
        return mabingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setMabingDelete(Integer mabingDelete) {
        this.mabingDelete = mabingDelete;
    }
    /**
	 * 设置：马病详细介绍
	 */
    public String getMabingContent() {
        return mabingContent;
    }


    /**
	 * 获取：马病详细介绍
	 */

    public void setMabingContent(String mabingContent) {
        this.mabingContent = mabingContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：最后更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
