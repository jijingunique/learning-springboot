package com.test.springboot_mybatisplus.service;


import com.test.springboot_mybatisplus.dao.domain.MusicInfo;

import java.util.List;

public interface MusicInfoService {

    public List<MusicInfo> getMusicInfo();
}
