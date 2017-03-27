package com.xqsight.common.core.service;

import com.xqsight.common.core.dao.IUpdateDao;
import com.xqsight.common.model.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangganggang
 * @Date 2017/3/23
 *
 * @param <Dao>
 * @param <Po>
 */
public abstract class AbstractEditService<Dao extends IUpdateDao<Po>, Po extends BaseModel> implements IEditService<Po> {

    @Autowired
    protected Dao dao;

    @Override
    public int editById(Po record) {
        return this.dao.updateById(record);
    }

    @Override
    public int batchEdit(List<Po> records) {
        return this.dao.batchUpdate(records);
    }
}