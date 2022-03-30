package com.example.novelcon.domain.store;

import com.example.novelcon.domain.User;

public interface UserStore {
  /**
   * 유저 정보 저장
   * @return 유저 ID
   */
  Long saveNewUser(User user);

  /**
   * 유저 정보 삭제
   * @param userId 삭제하고자 하는 유저 ID
   */
  void deleteNobel(Long userId);
}
