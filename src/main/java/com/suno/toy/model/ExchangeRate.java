package com.suno.toy.model;

import lombok.Data;

@Data
public class ExchangeRate {
    int result; // 조회 결과
    String cur_unit; // 통화코드
    String cur_nm; // 국가/통화명
    String del_bas_r; // 매매기준율
}
