package com.itheima.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mendy
 * @create 2023-06-26 19:41
 */
public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */

    @Transactional
    public void transfer(String out, String in, Double money) ;
}

