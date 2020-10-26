package com.august.service.impl;

import com.august.entity.DataMsg;
import com.august.entity.SiteCode;
import com.august.entity.SiteCodeExample;
import com.august.mapper.SiteCodeMapper;
import com.august.service.SiteCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author AUGUST
 * @description TODO
 * @date 2020/10/26 20:17
 */
@Service
public class SiteCodeServiceImpl implements SiteCodeService {
    @Resource
    private SiteCodeMapper codeMapper;

    @Override
    public DataMsg insertSiteCode(SiteCode code) {
        int flag = codeMapper.insertSelective(code);
        if (flag > 0) {
            return DataMsg.success();
        }
        return DataMsg.error();
    }

    @Override
    public DataMsg deleteSiteCode(Integer id) {
        int flag = codeMapper.deleteByPrimaryKey(id);
        if (flag > 0) {
            return DataMsg.success();
        }
        return DataMsg.error();
    }

    @Override
    public DataMsg updateSiteCode(SiteCode code) {
        int flag = codeMapper.updateByPrimaryKey(code);
        if (flag > 0) {
            return DataMsg.success();
        }
        return DataMsg.error();
    }

    @Override
    public DataMsg getSiteCode(Integer id) {
        SiteCode code = codeMapper.selectByPrimaryKey(id);
        if (code != null) {
            return DataMsg.success("SUCCESS", code, 1);
        }
        return DataMsg.noData();
    }

    @Override
    public DataMsg listSiteCode(SiteCode code) {
        SiteCodeExample example = new SiteCodeExample();
        example.setOrderByClause("id DESC");
        List<SiteCode> list = codeMapper.selectByExample(example);
        if (list.size() > 0) {
            return DataMsg.success("SUCCESS", list, (int) codeMapper.countByExample(example));
        }
        return DataMsg.noData();
    }
}
