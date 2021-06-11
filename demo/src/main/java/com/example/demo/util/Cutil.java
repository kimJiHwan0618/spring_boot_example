package com.example.demo.util;

import java.math.BigInteger;

// C(common) Util
// 일반적으로 많이 쓰이는 유틸
// Bigint를 Long으로 바꾸는게 너무 길기 때문에 사용.
public class Cutil {

  public static long getAsLong(Object object) {
    if ( object instanceof BigInteger ) {
      return ((BigInteger)object).longValue();
    }
    else if ( object instanceof Long ) {
      return (long)object;
    }
    else if ( object instanceof Integer ) {
      return (long)object;
    }
    else if ( object instanceof String ) {
      return Long.parseLong((String)object);
    }

    return -1;
  }
  
}
