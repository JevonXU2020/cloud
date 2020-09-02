package com.eiletxie.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //三个参数全参构造方法
@NoArgsConstructor  //空参构造方法
public class CommonResult<T> { //Json封装体CommonResult

    private Integer code;//错误类型
    private String message;//错误信息
    private T data;

    public CommonResult(Integer code, String message) {
//        this.code = code;
//        this.message = message;
        this(code,message,null);
    }
}
