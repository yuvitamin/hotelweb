package com.fourseasons.hotel.controller;
import com.fourseasons.hotel.domain.entity.TRoom;
import com.fourseasons.hotel.domain.vo.TRoomTypeVo;
import com.fourseasons.hotel.domain.vo.TRoomVo;
import com.fourseasons.hotel.service.RoomSystemService;
import com.fourseasons.hotel.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;


/**
 * @author yuzhi
 */
@RestController
@RequestMapping(value = "/room")
public class RoomSystemController {
    @Resource
    RoomSystemService roomsystemService;

    /**
     * *按类型查询显示房间信息
     * @return
     */

    @RequestMapping(value ="/contents")
    public Result getContentData(){
        try {
            List<TRoomTypeVo> tRoomTypeVoList= roomsystemService.getContent();
            return Result.success(tRoomTypeVoList);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 获取所有的房间列表
     * @return
     */

    @RequestMapping(value ="/all")
    public Result getAllRoomsData(){
        try {
            List<TRoomVo> tRoomVoList= roomsystemService.getAllRooms();
            return Result.success(tRoomVoList);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 房间详情页
     * @param roomId
     * @return
     */

    @RequestMapping(value ="/details")
    public Result getRoomDetails(Integer roomId){
        try {
            List<TRoomVo> roomDetails= roomsystemService.getRoomDetails(roomId);
            return Result.success(roomDetails);
        } catch (Exception e) {
            return Result.error();
        }

    }

    /**
     * 根据条件搜索查询房间的信息
     * @param keyword
     * @return
     */

    @RequestMapping(value ="/search")
    public Result<List<TRoom>> search(String keyword){
        try {
            List<TRoomVo> search = roomsystemService.search(keyword);
            return Result.success(search);
        } catch (Exception e){
            return Result.error();
        }
    }

}
