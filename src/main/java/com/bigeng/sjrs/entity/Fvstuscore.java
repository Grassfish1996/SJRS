package com.bigeng.sjrs.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author bigeng
 * @since 2020-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Fvstuscore implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String stuid;

    private String stuname;

    private String courseid;

    private String coursename;

    private Integer score;


}
