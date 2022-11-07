package com.example.mtruck.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mtruck.dto.NoticeDto;
import com.example.mtruck.mapper.NoticeMapper;

@Service
public class NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;
	
	public ArrayList<NoticeDto> getNoticeList(){
		return noticeMapper.getNoticeList();
	}
}
