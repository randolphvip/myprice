package com.sc.myPrice.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.myPrice.beans.Product;
import com.sc.myPrice.beans.ProductType;
import com.sc.myPrice.core.Result;
import com.sc.myPrice.core.ResultGenerator;
import com.sc.myPrice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/12/23.
*/
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public ProductController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping()
    public Result add(Product product) {

        productService.save(product);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping()
    public Result delete(@RequestParam Integer id) {
        productService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping()
    public Result update(Product product) {
        productService.update(product);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping()
    public Result detail(@RequestParam Integer id) {

        List<ServiceInstance> instances= discoveryClient.getInstances("PRODUCT_TYPE_SERVICE");
        for (ServiceInstance instance :instances){

            System.out.println("instance.getUri()"+instance.getUri());
        }


        System.out.println(instances.get(0).getUri()+"URI");
        Product product = productService.findById(id);
        ProductType  productType= restTemplate.getForObject("http://"+instances.get(0).getUri()+"/product/type?id=1", ProductType.class);
        System.out.println("here......"+productType);



        return ResultGenerator.genSuccessResult(product);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Product> list = productService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
