package com.bigeng.sjrs.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.bigeng.sjrs.entity.Subject;
import com.bigeng.sjrs.mapper.SubjectMapper;
import com.bigeng.sjrs.service.IScoreService;
import com.bigeng.sjrs.service.IStudentService;
import com.bigeng.sjrs.service.ISubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bigeng
 * @since 2020-03-29
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements ISubjectService {

}
