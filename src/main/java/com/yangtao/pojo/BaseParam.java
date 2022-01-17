package com.yangtao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Autuor: innthehell
 * @Date: 2022/1/7 - 01 - 07 - 23:45
 * @Description: com.yangtao.pojo
 * @Version: 1.0
 */
@Setter
@Getter
@ToString
public class BaseParam {

    // 候选人的任期号
    protected long term;
    // 被请求者的Id：（ip:port）
    protected String serverId;



}
