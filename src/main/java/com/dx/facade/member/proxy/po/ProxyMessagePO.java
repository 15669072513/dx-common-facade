package com.dx.facade.member.proxy.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("bw_player.proxy_message_notify")
public class ProxyMessagePO {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String userId;

    private String merchantId;

    private String title;

    private String content;

    private String createAt;

    private int messageStatus;
}
