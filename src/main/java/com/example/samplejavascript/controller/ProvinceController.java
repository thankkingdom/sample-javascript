package com.example.samplejavascript.controller;

import com.example.samplejavascript.entity.Province;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("province")
public class ProvinceController {

  @GetMapping("list")
  public ResponseEntity<List<Province>> getList() {
    List<Province> list = new ArrayList<>();
    
    list.add(new Province("01", "北海道"));
    list.add(new Province("02", "青森県"));
    list.add(new Province("03", "岩手県"));
    list.add(new Province("04", "宮城県"));
    list.add(new Province("05", "秋田県"));
    list.add(new Province("06", "山形県"));
    list.add(new Province("07", "福島県"));
    list.add(new Province("08", "茨城県"));
    list.add(new Province("09", "栃木県"));
    list.add(new Province("10", "群馬県"));
    list.add(new Province("11", "埼玉県"));
    list.add(new Province("12", "千葉県"));
    list.add(new Province("13", "東京都"));
    list.add(new Province("14", "神奈川県"));
    list.add(new Province("15", "新潟県"));
    list.add(new Province("16", "富山県"));
    list.add(new Province("17", "石川県"));
    list.add(new Province("18", "福井県"));
    list.add(new Province("19", "山梨県"));
    list.add(new Province("20", "長野県"));
    list.add(new Province("21", "岐阜県"));
    list.add(new Province("22", "静岡県"));
    list.add(new Province("23", "愛知県"));
    list.add(new Province("24", "三重県"));
    list.add(new Province("25", "滋賀県"));
    list.add(new Province("26", "京都府"));
    list.add(new Province("27", "大阪府"));
    list.add(new Province("28", "兵庫県"));
    list.add(new Province("29", "奈良県"));
    list.add(new Province("30", "和歌山県"));
    list.add(new Province("31", "鳥取県"));
    list.add(new Province("32", "島根県"));
    list.add(new Province("33", "岡山県"));
    list.add(new Province("34", "広島県"));
    list.add(new Province("35", "山口県"));
    list.add(new Province("36", "徳島県"));
    list.add(new Province("37", "香川県"));
    list.add(new Province("38", "愛媛県"));
    list.add(new Province("39", "高知県"));
    list.add(new Province("40", "福岡県"));
    list.add(new Province("41", "佐賀県"));
    list.add(new Province("42", "長崎県"));
    list.add(new Province("43", "熊本県"));
    list.add(new Province("44", "大分県"));
    list.add(new Province("45", "宮城県"));
    list.add(new Province("46", "鹿児島県"));
    list.add(new Province("47", "沖縄県"));

    return ResponseEntity.ok().body(list);
  }
}
