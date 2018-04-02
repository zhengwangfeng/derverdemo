package com.rpcdemo.demo.service;

import com.rpcdemo.demo.entity.ResultInfo;

public interface RPCInterface {
    /**
     * 通过Dubbo实现远程RPC调用接口信息
     * @return
     */
    public ResultInfo getRPCInfo();
}
