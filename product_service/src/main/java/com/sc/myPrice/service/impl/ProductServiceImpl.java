package com.sc.myPrice.service.impl;

import com.sc.myPrice.beans.Product;
import com.sc.myPrice.core.AbstractService;
import com.sc.myPrice.dao.ProductMapper;
import com.sc.myPrice.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/12/23.
 */
@Service
@Transactional
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {
    @Resource
    private ProductMapper productMapper;

}
