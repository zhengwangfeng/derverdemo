package com.rpcdemo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rpcdemo.demo.entity.ResultInfo;
import com.rpcdemo.demo.service.RPCInterface;

@Service
public class RPCInterfaceImpl implements RPCInterface {
    @Override
    public ResultInfo getRPCInfo() {
        ResultInfo resultInfo=new ResultInfo("我是RPC的返回信息，来自其它系统的实现方法");
        return resultInfo;
    }
}