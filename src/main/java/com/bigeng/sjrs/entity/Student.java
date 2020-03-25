package com.bigeng.sjrs.entity;

import java.time.LocalDate;
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
 * @since 2020-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

    private String name;

    private String sex;

    private LocalDate birthday;

    private String email;

    private String phone;

    private String collegeid;

    private String classid;


}
