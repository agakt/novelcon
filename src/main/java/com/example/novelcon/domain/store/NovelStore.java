package com.example.novelcon.domain.store;

import com.example.novelcon.domain.Novel;

public interface NovelStore {
  /**
   * 소설 정보 저장
   * @return 소설 ID
   */
  Long saveNewNovel(Novel novel);

  /**
   * 소설 삭제
   * @param novelId 삭제하고자 하는 소설 ID
   */
  void deleteNobel(Long novelId);
}
