package com.huang.dao

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.huang.pojo.Department
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Component

@Mapper
@Component
interface DepartmentMapper : BaseMapper<Department>