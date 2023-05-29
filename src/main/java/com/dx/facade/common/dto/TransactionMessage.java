package com.dx.facade.common.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="事务消息对象", description="事务消息对象")
public class TransactionMessage<T, V>{

    private Long tid;

    private T business;

    private V v;
}
