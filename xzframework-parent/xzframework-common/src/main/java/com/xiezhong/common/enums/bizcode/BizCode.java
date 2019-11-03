package com.xiezhong.common.enums.bizcode;

public interface BizCode<T> {

    T getCode();

    void setCode(T t);

    String getDescription();

    void setDescription(String description);
}
