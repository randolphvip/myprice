package com.sc.myPrice.service.impl;

import com.sc.myPrice.dao.ProductTypeMapper;
import com.sc.myPrice.beans.ProductType;
import com.sc.myPrice.service.ProductTypeService;
import com.sc.myPrice.core.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/12/22.
 */
@Service
@Transactional
public class ProductTypeServiceImpl extends AbstractService<ProductType> implements ProductTypeService {
    @Resource
    private ProductTypeMapper productTypeMapper;


}
