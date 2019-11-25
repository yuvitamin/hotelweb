package com.fourseasons.hotel.mapper;


import com.fourseasons.hotel.domain.entity.TOrder;
import com.fourseasons.hotel.domain.entity.TRoom;

import java.util.List;

/**
 * @author yuzhi
 */
public interface TOrderMapper {
    List<TOrder> findOrder();
}
