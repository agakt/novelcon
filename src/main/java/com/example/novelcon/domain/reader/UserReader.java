package com.example.novelcon.domain.reader;

import com.example.novelcon.domain.User;

public interface UserReader {
  User getUserById(Long id);
}
