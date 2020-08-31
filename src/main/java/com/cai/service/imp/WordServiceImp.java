package com.cai.service.imp;

import com.cai.entity.Word;
import com.cai.mapper.WordMapper;
import com.cai.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImp implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public Word getWord() {
        return wordMapper.getWord(1);
    }
}
