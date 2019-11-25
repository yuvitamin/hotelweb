package com.fourseasons.hotel.service.impl;

import com.fourseasons.hotel.domain.entity.TCompany;
import com.fourseasons.hotel.domain.entity.TOrder;
import com.fourseasons.hotel.domain.entity.TRoomType;
import com.fourseasons.hotel.mapper.TCompanyMapper;
import com.fourseasons.hotel.mapper.TOrderMapper;
import com.fourseasons.hotel.mapper.TRoomTypeMapper;
import com.fourseasons.hotel.service.IndexService;
import com.fourseasons.hotel.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuzhi
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    TRoomTypeMapper tRoomTypeMapper;
    @Resource
    TCompanyMapper tCompanyMapper;
    @Resource
    TOrderMapper tOrderMapper;

    @Override
    public CateBean getIndexData() {
        CateBean cateBean = new CateBean();
        List<TRoomType> tRoomType1List = tRoomTypeMapper.findTRoomType();
        List<TCompany> tCompanyList = tCompanyMapper.findTCompany();
        List<TOrder> tOrderList = tOrderMapper.findOrder();
        cateBean.setTRoomType1List(tRoomType1List);
        cateBean.setTCompanyList(tCompanyList);
        cateBean.setTOrderList(tOrderList);
        return cateBean;
    }
}
