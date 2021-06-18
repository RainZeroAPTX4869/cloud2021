package com.rain.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static <T> CommonResult success(String port, T data) {

        return new CommonResult(200, "success " + port, data);
    }

    public static CommonResult fail() {
        return new CommonResult(444, "fail");
    }
}
