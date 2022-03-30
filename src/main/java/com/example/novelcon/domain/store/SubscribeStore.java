package com.example.novelcon.domain.store;

import com.example.novelcon.domain.Subscribe;

public interface SubscribeStore {
  /**
   * 구독 정보 생성
   * @return 구독 ID
   */
  Long saveSubscribeInfo(Subscribe newSubscribe);

  /**
   * 구독 정보 삭제
   */
  void removeSubscribeInfo(Long subscibeId);
}
