package com.yangtao;

/**
 * @Autuor: innthehell
 * @Date: 2022/1/16 - 01 - 16 - 19:24
 * @Description: com.yangtao
 * @Version: 1.0
 */
public interface LifeCycle {

    void init() throws Throwable;

    void destroy() throws Throwable;

}
