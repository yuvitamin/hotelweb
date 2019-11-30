package com.fourseasons.hotel.service;

import com.fourseasons.hotel.domain.entity.TRoom;
import com.fourseasons.hotel.domain.vo.TRoomTypeVo;
import com.fourseasons.hotel.domain.vo.TRoomVo;

import java.util.List;

/**
 * @author yuzhi
 */
public interface RoomSystemService {
    List<TRoomTypeVo> getContent();
    List<TRoomVo> getAllRooms();
    List<TRoomVo> getRoomDetails(Integer roomId);
    List<TRoomVo> search(String keyword);
}
