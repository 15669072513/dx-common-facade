package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 * 游戏解散
 * @author broadway
 * @since 2023-06-08
 */
@Data
public class GameDissolveDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "table_id", type = IdType.INPUT)
    private String tableId;
}
