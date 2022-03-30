package com.example.novelcon.domain.reader;

import com.example.novelcon.domain.Subscribe;

public interface SubscriberReader {
  Subscribe getSubscribeInfoById(Long id);
}
