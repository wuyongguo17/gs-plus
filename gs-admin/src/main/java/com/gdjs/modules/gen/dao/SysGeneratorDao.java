package com.gdjs.modules.gen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gdjs.modules.gen.entity.ColumnEntity;
import com.gdjs.modules.gen.entity.ResultMapEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author gdjs
 * @email gdjs@k-banker.cn
 * @date 2018年12月19日 下午3:32:04
 */
@Mapper
public interface SysGeneratorDao extends BaseMapper<ResultMapEntity> {

    /**
     * queryPage
     *
     * @param page   分页参数
     * @param params 查询参数
     * @return List
     */
    List<ResultMapEntity> queryPage(Page<ResultMapEntity> page, @Param("params") Map<String, Object> params);

    /**
     * queryTable
     *
     * @param params 查询参数
     * @return ResultMapEntity
     */
    ResultMapEntity queryTable(Map<String, Object> params);

    /**
     * queryColumns
     *
     * @param params 查询参数
     * @return List
     */
    List<ColumnEntity> queryColumns(Map<String, Object> params);
}
