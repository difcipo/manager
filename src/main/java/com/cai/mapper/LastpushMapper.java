package com.cai.mapper;

import com.cai.entity.BLastpush;
import com.cai.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LastpushMapper {
    BLastpush getPush(@Param("id") int id);

    List<BLastpush> getPushList(@Param("start") int start, @Param("last") int last);

    int delPush(int id);

    int updatePush(BLastpush p);

    int addPush(BLastpush p);

    int totalTimes();

    List<BLastpush> getHot();

    List<BLastpush> getPushByColumn(@Param("id") int id);

    int getTotalSizeCol(@Param("id") int id);
}
