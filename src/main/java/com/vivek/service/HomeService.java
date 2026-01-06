package com.vivek.service;

import com.vivek.model.Home;
import com.vivek.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
