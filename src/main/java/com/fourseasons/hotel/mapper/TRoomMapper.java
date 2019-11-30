package com.fourseasons.hotel.mapper;


import com.fourseasons.hotel.domain.entity.TRoom;
import com.fourseasons.hotel.domain.vo.TRoomVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuzhi
 */

public interface TRoomMapper {
    List<TRoomVo> findAllRooms();

    List<TRoomVo> findByRoomId(@Param("roomId") Integer roomId);

    List<TRoomVo> findByKeyword(@Param("keyword") String keyword);

}
