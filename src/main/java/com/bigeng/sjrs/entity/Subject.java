package com.bigeng.sjrs.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author bigeng
 * @since 2020-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Subject implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String name;

    private Integer credit;


}
