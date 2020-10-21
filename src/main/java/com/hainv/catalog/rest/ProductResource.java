package com.hainv.catalog.rest;

import com.hainv.catalog.rest.request.CreateProductReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(tags = "Product Resource")
@RequestMapping("/products")
public interface ProductResource {

    @ApiOperation("Create Product")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created")})
    @PostMapping
    ResponseEntity<?> createProduct(@RequestBody @Valid CreateProductReq createProductReq);

    @ApiOperation("Get page of Product")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful")})
    @GetMapping
    ResponseEntity<?> getProducts();

    @ApiOperation("Get product detail")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful")})
    @GetMapping("/{productId}")
    ResponseEntity<?> getProductDetail(@PathVariable Long productId);

    @ApiOperation("Update Product")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Updated")})
    @PutMapping("/{productId}")
    ResponseEntity<?> updateProduct(@PathVariable Long productId);

    @ApiOperation("Get variants of Product")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful")})
    @GetMapping("/{productId}/variants")
    ResponseEntity<?> getVariants(@PathVariable Long productId);

}
