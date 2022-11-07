package com.example.mtruck.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.mtruck.dto.NoticeDto;

@Mapper
public interface NoticeMapper {

	ArrayList<NoticeDto> getNoticeList();
}
