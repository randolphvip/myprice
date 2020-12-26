package com.sc.myPrice.controller;
import com.sc.myPrice.core.Result;
import com.sc.myPrice.core.ResultGenerator;
import com.sc.myPrice.beans.ProductType;
import com.sc.myPrice.service.ProductTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/12/22.
*/
@RestController
@RequestMapping("/product/type")
public class ProductTypeController {
    @Resource
    private ProductTypeService productTypeService;

    @Autowired
    private  DiscoveryClient discoveryClient;

    @PostMapping()
    public Result add(ProductType productType) {
        productTypeService.save(productType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping()
    public Result delete(@RequestParam Integer id) {
        productTypeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping()
    public Result update(ProductType productType) {
        productTypeService.update(productType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping()
    public ProductType detail(@RequestParam Integer id) {
        ProductType productType = productTypeService.findById(id);
        System.out.println(".............."+productType.toString());
        return  productType;
     //   return ResultGenerator.genSuccessResult(productType);
    }



    @GetMapping("/list")
     public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        System.out.println("........！！！！！......");
        List<ProductType> list = productTypeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @RequestMapping(value = "newItem",method = RequestMethod.GET)
    public Result newItem(ProductType productType) {
        productTypeService.update(productType);
        return ResultGenerator.genSuccessResult();
    }
}
