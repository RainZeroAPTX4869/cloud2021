package com.rain.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author rainzero
 * @since 2021-06-16 11:39:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -45473313472466350L;
    /**
     * ID
     */
    private Long id;

    private String serial;


}