package com.hello.world.demo.controller;

import com.hello.world.demo.repository.Product;
import com.hello.world.demo.repository.ProductRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author jing.ji
 * @date 2018/8/2
 */
@RestController
@RequestMapping("/product")
public class ProjectController {

    @Autowired
    private ProductRepository productRepository;

    @ApiOperation(value="获取产品列表", notes="")
    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    public List<Product> getProductList() {
        List<Product> r =  productRepository.findAll();
        return r;
    }

    @ApiOperation(value="新增产品", notes="")
    @ApiImplicitParam(name = "product", value = "产品实体project", required = true, dataType = "Product")
    @RequestMapping(value="/post", method=RequestMethod.POST)
    public String postProduct(@ModelAttribute Product product) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数

        productRepository.save(product);
        return "success";
    }

    @ApiOperation(value="获取单个产品", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "产品ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "product", value = "产品实体project", required = true, dataType = "Product")
    })
    @RequestMapping(value="/get/{id}", method=RequestMethod.GET)
    public Product getProduct(@PathVariable Integer id) {
        // url中的id可通过@PathVariable绑定到函数的参数中
        Optional<Product> p = productRepository.findById(id);

        return p.get();
    }

    @ApiOperation(value="删除单个产品", notes="")
    @ApiImplicitParam(name = "id", value = "产品ID", required = true, dataType = "Integer")
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public String deleteProduct(@PathVariable Integer id) {
        productRepository.deleteById(id);
        return "success";
    }
}
