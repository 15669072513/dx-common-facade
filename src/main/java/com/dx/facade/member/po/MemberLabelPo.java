package com.dx.facade.member.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 会员标签表
*
* @author fitz
* @version 1.0.0
* @date 2021/06/02
*/
@ApiModel(value="com-bw-member-po-MemberLabelPo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bw_player.bw_member_label")
public class MemberLabelPo implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 商户id
     */
    @TableField(value = "merchant_id")
    @ApiModelProperty(value="商户id")
    private Long merchantId;
    
    
    @TableField(value = "app_id")
    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    /**
     * 标签名称
     */
    @TableField(value = "member_label_name")
    @ApiModelProperty(value="标签名称")
    private String memberLabelName;

    /**
     * 标签描述
     */
    @TableField(value = "label_desc")
    @ApiModelProperty(value="标签描述")
    @JsonProperty("description")
    private String labelDesc;

    /**
     * 创建时间
     */
    @TableField(value = "created_at")
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createdAt;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    @ApiModelProperty(value="创建人")
    private String createdBy;

    /**
     * 修改时间
     */
    @TableField(value = "updated_at")
    @ApiModelProperty(value="修改时间")
    private LocalDateTime updatedAt;

    /**
     * 修改人
     */
    @TableField(value = "updated_by")
    @ApiModelProperty(value="修改人")
    private String updatedBy;

    /**
     * 是否删除（0-未删除 1-已删除）
     */
    @TableField(value = "del_flag")
    @ApiModelProperty(value="是否删除（0-未删除 1-已删除）")
    private Integer delFlag;
	
	@TableField(value = "data_type")
	@ApiModelProperty(value="数据类型 （0-会员 1-代理）")
	private Integer dataType;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_MERCHANT_ID = "merchant_id";

    public static final String COL_MEMBER_LABEL_NAME = "member_label_name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_CREATED_AT = "created_at";

    public static final String COL_CREATED_BY = "created_by";

    public static final String COL_UPDATED_AT = "updated_at";

    public static final String COL_UPDATED_BY = "updated_by";

    public static final String COL_DEL_FLAG = "del_flag";
    
    public static final String COL_DATA_TYPE = "data_type";
}