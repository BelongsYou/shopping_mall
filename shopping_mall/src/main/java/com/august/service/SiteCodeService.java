package com.august.service;

import com.august.entity.DataMsg;
import com.august.entity.SiteCode;

/**
 * @author AUGUST
 * @description TODO
 * @date 2020/10/24 16:01
 */
public interface SiteCodeService {
    /**
     * 添加
     */
    DataMsg insertSiteCode(SiteCode code);

    /**
     * 删除
     */
    DataMsg deleteSiteCode(Integer id);

    /**
     * 修改
     */
    DataMsg updateSiteCode(SiteCode code);

    /**
     * 查询
     */
    DataMsg getSiteCode(Integer id);

    DataMsg listSiteCode(SiteCode code);
}
