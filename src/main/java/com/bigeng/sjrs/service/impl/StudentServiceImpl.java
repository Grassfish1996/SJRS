package com.bigeng.sjrs.service.impl;

import com.bigeng.sjrs.entity.Student;
import com.bigeng.sjrs.mapper.StudentMapper;
import com.bigeng.sjrs.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bigeng
 * @since 2020-03-25
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
