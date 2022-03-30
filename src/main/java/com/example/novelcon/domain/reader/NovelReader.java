package com.example.novelcon.domain.reader;

import com.example.novelcon.domain.Novel;

public interface NovelReader {
  Novel getNovelById(Long id);
}
