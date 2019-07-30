package com.example.samplejavascript.controller;

import com.example.samplejavascript.mybatis.domain.mapper.CatalogsMapper;
import com.example.samplejavascript.mybatis.domain.model.Catalogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class TopPageController {

    @Autowired
    private CatalogsMapper catalogMapper;

    @RequestMapping("/top")
    public String top(Model model) {

        List<Catalogs> catalogList = catalogMapper.selectByExample(null);
        for(Catalogs c: catalogList) {
            System.out.println(String.format("%s", c.getCatalogName()));
        }

        return "top";
    }
}