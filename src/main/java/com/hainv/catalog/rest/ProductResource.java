package com.hainv.catalog.rest;

import com.hainv.catalog.rest.request.CreateProductReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Api(tags = "Product Resource")
@RequestMapping("/products")
public interface ProductResource {

    @ApiOperation("Create Product")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created")})
    @PostMapping
    ResponseEntity<?> createProduct(@RequestBody @Valid CreateProductReq createProductReq);
}
